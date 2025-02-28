public class Electronics extends Product {
    private String brand;

    public Electronics(int productID, String name, double price, int quantity, String brand) {
        super(productID, name, "Electronics", price, quantity); // Call parent class constructor
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public double calculateDiscount() {
        return price * 0.20;
    }

    @Override
    public String toString() {
        return super.toString() + " | Brand: " + brand + " | Discount: $" + calculateDiscount();
    }
}

