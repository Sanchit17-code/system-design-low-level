package VendingMachine;

public class PaymentProcessingState implements State{
    @Override
    public void selectProduct(String id, int quantity, VendingMachine machine) {
        throw new RuntimeException("Product already selected");
    }

    @Override
    public void processPayment(PaymentStrategy strategy, int amountGiven, VendingMachine machine) {
        machine.setAmountGiven(amountGiven);
        if(machine.isStockEnoughForGivenProduct()){
            if(machine.getAmountToBePaid() <= amountGiven){
                strategy.pay(machine.getAmountToBePaid() );
                machine.setAmountToBeReturned(amountGiven - machine.getAmountToBePaid());
                machine.returnTheAmount();
                machine.setCurrentState(new DispenseState());
            }else{
                machine.setAmountToBeReturned(amountGiven);
                machine.returnTheAmount();
                machine.selectProductAndQuantity("",0);
                machine.setCurrentState(new IdleState());
                throw new RuntimeException("you have given the lesser amount than what is required");
            }
        }
        else{
            machine.selectProductAndQuantity("",0);
            machine.setCurrentState(new IdleState());
            throw new RuntimeException("Not enough stock");
        }
    }

    @Override
    public void dispenceProduct(Product product, int quantity, VendingMachine machine) {
        throw new RuntimeException("Please make the payment first");
    }
}
