package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    // Constructor
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Cosntructor overloading
    // We can have multiple construtctors in a class
    // as long as they have different parameters
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        // this.quantity = 0; (OPTIONAL because java automatically assigns 0 to integers)
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}