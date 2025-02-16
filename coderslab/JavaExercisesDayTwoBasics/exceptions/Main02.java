package pl.coderslab.JavaExercisesDayTwoBasics.exceptions;

public class Main02 {

    public static void main(String[] args) {
        // Create an array of integers
        int[] tab = { 5, 1, 6, 7, 8 };

        try {
            // Attempt to access an out-of-bounds index (21)
            System.out.println(tab[21]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the exception and print an error message
            System.err.println("Error: " + e.getMessage());
        }
    }
}