package VendingMachine;

public interface State {
    void selectProduct(String id, int quantity, VendingMachine machine);
    void processPayment(PaymentStrategy strategy, int amount, VendingMachine machine);
    void dispenceProduct(Product product, int quantity, VendingMachine machine);
}
