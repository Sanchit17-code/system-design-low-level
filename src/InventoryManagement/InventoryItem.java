package InventoryManagement;

import java.util.ArrayList;
import java.util.List;

public class InventoryItem {
    private Product product;
    private long quantity;
    private long threshold;
    List<InventoryObserver> observers;
    public InventoryItem(Product product, long quantity, long threshold) {
        this.product = product;
        this.quantity = quantity;
        this.threshold = threshold;

        observers = new ArrayList<>();
    }

    void addStock(long quantity){
        this.quantity += quantity;
    }

    synchronized void removeStock(long quantity){
        long currentQ = this.quantity;
        if(currentQ < quantity){
            throw new RuntimeException("Not enough stock");
        }
        this.quantity -= quantity;
        if(this.quantity < this.threshold){
            notifyAllObservers();
        }
    }

    void addObserver(InventoryObserver observer){
        observers.add(observer);
    }

    void notifyAllObservers(){
        for(InventoryObserver observer : observers){
            observer.update(product, quantity);
        }
    }

    public Product getProduct() {
        return product;
    }

    public long getQuantity() {
        return quantity;
    }

    public long getThreshold() {
        return threshold;
    }

    public void setThreshold(long threshold) {
        this.threshold = threshold;
    }
}
