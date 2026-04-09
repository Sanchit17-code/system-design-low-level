package InventoryManagement;

import java.util.List;
import java.util.Map;

public class InventoryManager {
    private Map<String,Warehouse> warehouseMap;
    private Map<String,Product> productMap;

    void addWarehouse(String id, String name, String address){
        warehouseMap.put(id, new Warehouse(id,name,address));
    }

    void addProduct(String id, String name, Double price, ProductCategory productCategory){
        productMap.put(id, new Product(id,name,price,productCategory));
    }

    void addInventoryToWarehouse(String warehouseId, String productId, long quantity, long threshold){
        Warehouse warehouse = warehouseMap.get(warehouseId);
        Product product = productMap.get(productId);
        warehouse.addInventoryItem(product,quantity,threshold);
    }

    void addStockToWarehouse(String warehouseId, String productId, long quantity){
        Warehouse warehouse = warehouseMap.get(warehouseId);
        Product product = productMap.get(productId);
        warehouse.addStock(productId,quantity);
    }

    void removeStockFromWarehouse(String warehouseId, String productId, long quantity){
        Warehouse warehouse = warehouseMap.get(warehouseId);
        Product product = productMap.get(productId);
        warehouse.removeStock(productId,quantity);
    }
}
