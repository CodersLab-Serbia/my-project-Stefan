//Exercise 4
//
//In the `pl.coderslab.homeworks.exceptions` package in the `Main04.java`file, place a method with the signature:
//
//`public static int toInt(String str)`.
//
//1. Fill the body of the method so that it returns the `str` string converted to `int` type.
//2. Handle the possible exceptions.

package en.coderslab.homeworks.Exceptions;

public class Main04 { // cmnd^G za odabir vise istih recenica//

    public static void main(String[] args) {
        // Testing the toInt method with various inputs
        System.out.println(toInt("123"));  // Valid case: should print 123
        System.out.println(toInt("456"));  // Valid case: should print 456
        System.out.println(toInt("abc"));  // Invalid case: should handle NumberFormatException
        System.out.println(toInt("12.34")); // Invalid case: should handle NumberFormatException
        System.out.println(toInt(""));      // Invalid case: should handle NumberFormatException
    }

    /**
     * Converts the given string to an integer.
     *
     * @param str - the string to convert
     * @return the integer value of the string, or 0 if conversion fails
     */
    public static int toInt(String str) {
        try {
            // Attempt to convert the string to an integer
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            // Handle the exception and return 0 in case of an error
            System.out.println("Invalid input for conversion: " + str);
            return 0; // You can choose to return a different value or rethrow the exception
        }
    }
}