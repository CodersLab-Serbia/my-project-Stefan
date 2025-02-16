//Exercise 1.
// Create a `Burger` class, add the following attributes to it:
//
//- size,
//- price.
//
//1. Create a constructor that will accept and set the `size` and `price` parameters.
//2. Create a no-argument constructor.
package en.coderslab.homeworks.Constructor;

public class Burger {
    // Attributes
    private String size;  // Size of the burger
    private double price;  // Price of the burger

    // Constructor that accepts size and price parameters
    public Burger(String size, double price) {
        this.size = size;
        this.price = price;
    }

    // No-argument constructor
    public Burger() {
        this.size = "Medium"; // Default size
        this.price = 5.99;    // Default price
    }

    // Getters
    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    // toString method for displaying burger information
    @Override
    public String toString() {
        return "Burger{" +
                "size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}