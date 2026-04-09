package VendingMachine;

import InventoryManagement.Product;

import java.util.ArrayList;
import java.util.List;

public class InventoryItem {
    Product product;
    int quantity;
    int threshold;
    List<Observer> observers;

    public InventoryItem(Product product, int quantity, int threshold) {
        this.product = product;
        this.quantity = quantity;
        this.threshold = threshold;
        observers = new ArrayList<>();
    }
    void addObserver(Observer observer){
        observers.add(observer);
    }
    void removeObserver(Observer observer){
        observers.remove(observer);
    }
    public void addStock(int quantity){
        this.quantity += quantity;
    }
    public void removeStock(int quantity){
        if(this.quantity >= quantity){
            this.quantity -= quantity;
            this.checkThreshold();
        }
        else{
            throw new RuntimeException("Not enough quantity of this product");
        }
    }

    void checkThreshold(){
        if(this.quantity<= this.threshold){
            notifyObservers();
        }
    }

    void notifyObservers(){
        for(Observer observer : observers){
            observer.update(this.product.getId());
        }
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getThreshold() {
        return threshold;
    }
}
