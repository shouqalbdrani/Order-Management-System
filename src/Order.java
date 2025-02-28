import java.util.List;

public class Order {
    private int orderID;
    private int userID;
    private List<OrderDetails> orderDetailsList;
    private double totalAmount;

    // Constructor
    public Order(int orderID, int userID, List<OrderDetails> orderDetailsList) {
        this.orderID = orderID;
        this.userID = userID;
        this.orderDetailsList = orderDetailsList;
        calculateTotalAmount();
    }

    // Calculate total amount
    private void calculateTotalAmount() {
        this.totalAmount = orderDetailsList.stream().mapToDouble(OrderDetails::getSubTotal).sum();
    }

    // Getters
    public int getOrderID() {
        return orderID;
    }

    public int getUserID() {
        return userID;
    }

    public List<OrderDetails> getOrderDetailsList() {
        return orderDetailsList;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    @Override
    public String toString() {
        return "Order ID: " + orderID + " | User ID: " + userID + " | Total: $" + totalAmount +
                "\nDetails: " + orderDetailsList;
    }
}
