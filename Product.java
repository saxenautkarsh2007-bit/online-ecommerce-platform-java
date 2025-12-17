package model;

public class Product {
    private int id;
    private String name;
    private String description;
    private double price;
    private int quantity;
    private int sellerId;

    public Product(String name, String description, double price, int quantity, int sellerId) {
        if (price <= 0 || quantity <= 0)
            throw new IllegalArgumentException("Invalid price or quantity");

        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.sellerId = sellerId;
    }

    public String getName() { return name; }
    public String getDescription() { return description; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public int getSellerId() { return sellerId; }
}
