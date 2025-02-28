public class Clothing extends Product {
    private String color;
    private String material;

    public Clothing(int productID, String name, double price, int quantity, String color, String material) {
        super(productID, name, "Clothing", price, quantity); // Call Product constructor
        this.color = color;
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public double calculateDiscount() {
        return price * 0.20;
    }

    @Override
    public String toString() {
        return super.toString() + " | Color: " + color + " | Material: " + material + " | Discount: $" + calculateDiscount();
    }
}

