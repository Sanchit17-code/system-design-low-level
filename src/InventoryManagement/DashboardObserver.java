package InventoryManagement;

public class DashboardObserver implements InventoryObserver{
    @Override
    public void update(Product product, long quantity) {
        System.out.println("there is a shortage of the product with id " + product.getId() + " and having the quantity just " + quantity);
    }
}
