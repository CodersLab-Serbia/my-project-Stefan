//Exercise 3
//
//In the `pl.coderslab.homeworks.exceptions` package in the `Main03.java`file, place a method with the signature:
//
//`public static int getLength(String str)`.
//
//1. Fill the body of the method so that it returns the length of the `str` string.
//2. Test the method by passing a parameter with the value of `null` to it.
//3. Protect the program from the `NullPointerException`.

package en.coderslab.homeworks.Exceptions;

public class Main03 {
    public static void main(String[] args) {
        // Test the method with null
        int length = getLength(null);
        System.out.println("Length: " + length);
    }

    public static int getLength(String str) {
        // Check if the string is null and return 0, or return its length
        if (str == null) {
            return 0; // or handle it in another way if needed
        }
        return str.length();
    }
}