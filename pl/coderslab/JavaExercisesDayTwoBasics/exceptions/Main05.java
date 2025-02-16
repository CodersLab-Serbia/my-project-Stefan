package pl.coderslab.JavaExercisesDayTwoBasics.exceptions;

public class Main05 {

    public static void main(String[] args) {
        try {
            // Attempt to parse the number from an invalid string "xyz"
            int num = Integer.parseInt("!§$");
            System.out.println(num);
        } catch (NumberFormatException e) {
            // Handle the NumberFormatException
            System.err.println("Error: " + e.getMessage());
        } finally {
            // This block will execute regardless of whether an exception was thrown
            System.out.println("Execution completed, either successfully or with an error.");
        }
    }
}