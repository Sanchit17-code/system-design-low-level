package InventoryManagement;

public interface InventoryObserver {
    void update(Product product, long quantity);
}

