package model;

public class Order {
    private int buyerId;
    private int productId;
    private int quantity;

    public Order(int buyerId, int productId, int quantity) {
        if (quantity <= 0)
            throw new IllegalArgumentException("Invalid Quantity");

        this.buyerId = buyerId;
        this.productId = productId;
        this.quantity = quantity;
    }

    public int getBuyerId() { return buyerId; }
    public int getProductId() { return productId; }
    public int getQuantity() { return quantity; }
}
