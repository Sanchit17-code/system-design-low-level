package VendingMachine;

import InventoryManagement.Product;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    Map<String, InventoryItem> itemMap;

    public Inventory() {
        this.itemMap = new HashMap<>();
    }

    void addProduct(Product product, int quantity, int threshold){
        itemMap.put(product.getId(), new InventoryItem(product,quantity,threshold));
    }

    boolean isStockEnoughForGivenProduct(String id, int requiredQuantity){
        InventoryItem inventoryItem = itemMap.get(id);
        int availableQuantity = inventoryItem.getQuantity();
        if(availableQuantity>=requiredQuantity){
            return true;
        }
        else{
            return false;
        }
    }

    void addStock(String id, int quantity ){
        if(itemMap.containsKey(id)){
            InventoryItem inventoryItem = itemMap.get(id);
            inventoryItem.addStock(quantity);
        }
    }

    void removeStock(String id, int quantity ){
        if(itemMap.containsKey(id)){
            InventoryItem inventoryItem = itemMap.get(id);
            inventoryItem.removeStock(quantity);
        }
    }

    int totalAmountToBePaid(String id, int quantity){
        InventoryItem inventoryItem = itemMap.get(id);
        return inventoryItem.getProduct().getPrice() * quantity ;
    }

    void seeAllStockInInventory(){
        for(Map.Entry<String,InventoryItem> entry : itemMap.entrySet()){
            System.out.println("for product id " + entry.getKey() + " we have " + entry.getValue().getQuantity() + " quantities");
        }
    }

    public Map<String, InventoryItem> getItemMap() {
        return itemMap;
    }
}
