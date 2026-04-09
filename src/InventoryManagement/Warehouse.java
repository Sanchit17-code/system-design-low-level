package InventoryManagement;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    private String id;
    private String name;
    private String address;
    private Map<String,InventoryItem> itemMap;

    public Warehouse(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
        itemMap = new HashMap<>();
    }

    void addInventoryItem(Product product, long quantity, long threshold){
        itemMap.put(product.getId(), new InventoryItem(product,quantity,threshold));
    }

    void addStock(String id, long quantity){
        if(itemMap.containsKey(id)){
            InventoryItem inventoryItem = itemMap.get(id);
            inventoryItem.addStock(quantity);
        }
        else{
            throw  new RuntimeException("inventory item not present");
        }
    }

    void removeStock(String id, long quantity){
        if(itemMap.containsKey(id)){
            InventoryItem inventoryItem = itemMap.get(id);
            inventoryItem.removeStock(quantity);
        }
        else{
            System.out.println("the item with this product id is not presennt, kindly add the item first");
        }
    }

    InventoryItem getInventoryItemByProductId(String id){
        if(itemMap.containsKey(id)){
            return itemMap.get(id);
        }
        return null;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Map<String, InventoryItem> getItemMap() {
        return itemMap;
    }
}
