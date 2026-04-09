package InventoryManagement;

public  class Product {
    private String id;
    private String name;
    private int price;
    private ProductCategory productCategory;

    public Product(String id, String name, int price, ProductCategory productCategory) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.productCategory = productCategory;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }
}
