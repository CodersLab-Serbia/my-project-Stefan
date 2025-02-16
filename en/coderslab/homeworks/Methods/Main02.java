package en.coderslab.homeworks.methods;

public class Main02 {
    public static void main(String[] args) {
        // Example usage
        System.out.println(divisibleBy(10, 2)); // Output: true
        System.out.println(divisibleBy(10, 3)); // Output: false
    }

    public static boolean divisibleBy(int a, int b) {
        // Check if b is not zero to avoid division by zero
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a % b == 0; // Returns true if a is divisible by b
    }
}