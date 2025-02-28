import java.util.*;

class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}

abstract class Product {
    protected int productID;
    protected String name;
    protected String category;
    protected double price;
    protected int stockQuantity;

    // Constructor
    public Product(int productID, String name, String category, double price, int stockQuantity) {
        this.productID = productID;
        this.name = name;
        this.category = category;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }


    public int getProductID() {
        return productID;
    }

    public String getName() {

        return name;
    }
    public String getCategory() {
        return category;
    }
    public double getPrice() {
        return price;
    }
    public int getStockQuantity() {
        return stockQuantity;
    }

    public void reduceStock(int quantity) throws OutOfStockException {
        if (stockQuantity < quantity) {
            throw new OutOfStockException("Insufficient stock for " + name);
        }
        stockQuantity -= quantity;
    }

    public abstract double calculateDiscount(); // so it can be use in both electronics and clothing

    @Override
    public String toString() {
        return name + " (" + category + ") - $" + price + " [Stock: " + stockQuantity + "]";
    }
}