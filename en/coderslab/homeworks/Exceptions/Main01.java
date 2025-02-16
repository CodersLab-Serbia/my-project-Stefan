//Exercise 1
//
//In the `en.coderslab.homeworks.Exceptions` package in the `en.coderslab.homeworks.Exceptions.Main01.java` file, place a method with the signature:
//
//`public static void average(String a, String b)`.
//
//1. Fill the body of the method so that it converts the variables `a` and `b` to an `int` numeric type, and divides variable `a` by variable `b`.
//2. Protect the program from possible errors.
//3. Add a section that will always be executed regardless of whether an error occurs or not.
//4. Keep in mind the `ArithmeticException` error.
//5. Change the type of variables `a` and `b` to `double` and see what results you get when you divide by `0`.

package en.coderslab.homeworks.Exceptions;

public class Main01 {
    public static void main(String[] args) {
        average("10", "2"); // Normal case: valid input
        average("10", "0"); // Division by zero case: should handle ArithmeticException
        average("10", "abc"); // Invalid input case: should handle NumberFormatException
    }

    /**
     * 1. Converts the variables a and b to double and divides a by b.
     * @param a - first number as a String
     * @param b - second number as a String
     */
    public static void average(String a, String b) {
        double numA = 0; // Initialize numA
        double numB = 0; // Initialize numB

        try {
            // Convert strings to double
            numA = Double.parseDouble(a); // Convert a to double
            numB = Double.parseDouble(b); // Convert b to double

            // Perform division
            double result = numA / numB; // Division operation
            System.out.println("Average: " + result); // Print the result
        } catch (ArithmeticException e) {
            // 4. Handle division by zero
            System.out.println("Error: Division by zero.");
        } catch (NumberFormatException e) {
            // Handle invalid input format
            System.out.println("Error: Invalid input. Please enter valid numbers.");
        } finally {
            // 3. This block will always be executed
            System.out.println("Execution completed."); // Always executed
        }
    }
}