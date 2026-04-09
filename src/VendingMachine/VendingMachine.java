package VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    Inventory inventory;
    List<Product>products;
    State currentState;
    String selectedProductId;
    int selectedQuantity;
    int amountToBePaid;
    int amountGiven;
    int amountToBeReturned;

    public VendingMachine() {
        this.inventory = new Inventory();
        this.products = new ArrayList<>();
        this.currentState = new IdleState();
    }

    void initializeObservers(Observer observer){
        for(InventoryItem item : inventory.getItemMap().values()){
            item.addObserver(observer);
        }
    }

    void returnTheAmount(){
        System.out.println("amount " + amountToBeReturned + " is returned");
        amountGiven=0;
        amountToBeReturned=0;
    }

    boolean isStockEnoughForGivenProduct(){
        return inventory.isStockEnoughForGivenProduct(selectedProductId,selectedQuantity);
    }

    void selectProduct(String id, int quantity){
        currentState.selectProduct( id, quantity, this);
    }

    public void setAmountGiven(int amountGiven) {
        this.amountGiven = amountGiven;
    }

    void selectProductAndQuantity(String selectedProductId, int quantity){
        this.selectedProductId = selectedProductId;
        this.selectedQuantity = quantity;
        this.amountToBePaid = inventory.totalAmountToBePaid(selectedProductId,quantity);
    }

    void processPayment(PaymentStrategy paymentStrategy, int amount){
        currentState.processPayment(paymentStrategy,amount,this);
    }

    void dispenceProduct(Product product, int quantity){
        currentState.dispenceProduct(product,quantity,this);
    }

    void removeStock(){
        inventory.removeStock(selectedProductId,selectedQuantity);
    }

    void setCurrentState(State nextState){
        this.currentState = nextState;
    }

    void addProduct(String id, String name, int price ){
        Product product = new Product(id,name,price);
        products.add(product);
    }


    public Inventory getInventory() {
        return inventory;
    }

    public List<Product> getProducts() {
        return products;
    }

    public State getCurrentState() {
        return currentState;
    }

    public int getAmountToBePaid() {
        return amountToBePaid;
    }

    public void setAmountToBeReturned(int amountToBeReturned) {
        this.amountToBeReturned = amountToBeReturned;
    }

    public int getAmountToBeReturned() {
        return amountToBeReturned;
    }
}
