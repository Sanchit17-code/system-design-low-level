package VendingMachine;

public class DispenseState implements State{
    @Override
    public void selectProduct(String id, int quantity, VendingMachine machine) {
        throw new RuntimeException("wait for the items to be dispensed first");
    }

    @Override
    public void processPayment(PaymentStrategy strategy, int amount, VendingMachine machine) {
        throw new RuntimeException("wait for the items to be dispensed first");
    }

    @Override
    public void dispenceProduct(Product product, int quantity, VendingMachine machine) {
        System.out.println("dispensing the requested product");
        machine.removeStock();
        machine.selectProductAndQuantity("",0);
        machine.setCurrentState(new IdleState());
    }
}
