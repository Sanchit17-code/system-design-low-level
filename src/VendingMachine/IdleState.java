package VendingMachine;

public class IdleState implements State{

    @Override
    public void selectProduct(String id, int quantity, VendingMachine machine) {
        machine.selectProductAndQuantity(id,quantity);
        machine.setCurrentState(new PaymentProcessingState());
    }

    @Override
    public void processPayment(PaymentStrategy strategy, int amount, VendingMachine machine) {
        throw new RuntimeException("First select the product");
    }

    @Override
    public void dispenceProduct(Product product, int quantity, VendingMachine machine) {
        throw new RuntimeException("First select the product");
    }
}
