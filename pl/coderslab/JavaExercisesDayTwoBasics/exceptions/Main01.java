package pl.coderslab.JavaExercisesDayTwoBasics.exceptions;

import java.util.NoSuchElementException;

public class Main01 {

    public static void main(String[] args) {
        try {
            // Test with a correct parameter (5)
            int result = factorial(5);
            System.out.println("Factorial of 5: " + result);

            // Testing with an incorrect parameter (-1)
            result = factorial(-1);
            System.out.println("Factorial of -1: " + result);
        } catch (IllegalArgumentException e) {
            // Handle the IllegalArgumentException if a negative number is passed
            System.err.println("Error: " + e.getMessage());
        } catch (NoSuchElementException e) {
            // Handle NoSuchElementException if it occurs (not triggered in this code)
            System.err.println("No such element: " + e.getMessage());
        }
    }

    static int factorial(int number) {
        // Checking if the input number is negative
        if (number < 0) {
            // Throw an IllegalArgumentException if the number is negative
            throw new IllegalArgumentException("Number must be non-negative.");
        }

        int result = 1; // Initialize result to 1 for factorial calculation
        // Calculate factorial using a loop
        for (int i = 1; i <= number; i++) {
            result *= i; // Multiply result by the current number
        }
        return result; // Return the calculated factorial
    }
}