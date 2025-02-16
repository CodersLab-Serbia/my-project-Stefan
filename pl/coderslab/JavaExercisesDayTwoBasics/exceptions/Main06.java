package pl.coderslab.JavaExercisesDayTwoBasics.exceptions;

public class Main06 {

    public static void main(String[] args) {
        try {
            // Test with an incorrect parameter (b = 0)
            int result = divide(55, 0);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            // Handle the IllegalArgumentException
            System.err.println("Error: " + e.getMessage());
        }

        // Test with a correct parameter (b = 2)
        try {
            int result = divide(10, 2);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    static int divide(int a, int b) {
        // Check if b is zero and throw an IllegalArgumentException if it is
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        // Perform the division and return the integer part of the result
        return a / b;
    }
}