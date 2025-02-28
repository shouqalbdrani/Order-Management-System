public class OrderDetails {
    private int orderDetailID;
    private int orderID;
    private Product product;
    private int quantity;
    private double subTotal;

    // Constructor
    public OrderDetails(int orderDetailID, int orderID, Product product, int quantity) {
        this.orderDetailID = orderDetailID;
        this.orderID = orderID;
        this.product = product;
        this.quantity = quantity;
        this.subTotal = product.getPrice() * quantity;
    }

    // Getters
    public int getOrderDetailID() {
        return orderDetailID;
    }

    public int getOrderID() {
        return orderID;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getSubTotal() {
        return subTotal;
    }

    @Override
    public String toString() {
        return product.getName() + " x " + quantity + " = $" + subTotal;
    }
}

