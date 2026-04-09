package VendingMachine;

public class AdminObserver implements Observer{


    @Override
    public void update(String productId) {
        System.out.println("product with the id "+ productId + " needs to be filled");
    }
}
