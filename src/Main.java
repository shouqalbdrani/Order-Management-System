import java.util.*;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Order> orders = new ArrayList<>();
    private static Map<Integer, Order> orderHistory = new HashMap<>();
    private static int orderCounter = 1; // Unique Order ID Generator

    public static void main(String[] args) {
        while (true) {
            System.out.println("Order Management System");
            System.out.print("Choose option: ");
            System.out.println("\n");
            System.out.println("1. Place Order");
            System.out.println("2. View Order History");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> placeOrder();
                case 2 -> viewOrderHistory();
                case 3 -> {
                    System.out.println("Exiting system...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice! Try again.");
            }
        }
    }

    private static void placeOrder() {
        System.out.print("Enter User ID: ");
        int userID = scanner.nextInt();

        List<OrderDetails> orderDetailsList = new ArrayList<>();

        while (true) {
            System.out.print("Choose product type (1: Electronics, 2: Clothing): ");
            int type = scanner.nextInt();

            System.out.print("Enter Product Name: ");
            String productName = scanner.next();

            System.out.print("Enter Price: ");
            double price = scanner.nextDouble();

            System.out.print("Enter Quantity: ");
            int quantity = scanner.nextInt();

            Product product = null; // default

            if (type == 1) {
                System.out.print("Enter Brand: ");
                String brand = scanner.next();
                product = new Electronics(orderCounter, productName, price, quantity, brand);
            } else if (type == 2) {
                System.out.print("Enter Color: ");
                String color = scanner.next();
                System.out.print("Enter Material: ");
                String material = scanner.next();
                product = new Clothing(orderCounter, productName, price, quantity, color, material);
            } else {
                System.out.println("Invalid product type! Try again.");
                continue;
            }

            OrderDetails orderDetail = new OrderDetails(orderCounter, orderCounter, product, quantity);
            orderDetailsList.add(orderDetail);

            System.out.print("Add another product? (yes/no): ");
            String moreProducts = scanner.next();
            if (!moreProducts.equalsIgnoreCase("yes")) {
                break; //stop
            }
        }

        Order newOrder = new Order(orderCounter++, userID, orderDetailsList);
        orders.add(newOrder);
        orderHistory.put(newOrder.getOrderID(), newOrder);

        System.out.println("Order placed successfully! Order ID: " + newOrder.getOrderID());
    }

    private static void viewOrderHistory() {
        if (orderHistory.isEmpty()) {
            System.out.println("No orders placed yet.");
            return;
        }

        System.out.println(" Order History is ");
        for (Order order : orderHistory.values()) {
            System.out.println(order);
        }
    }
}
