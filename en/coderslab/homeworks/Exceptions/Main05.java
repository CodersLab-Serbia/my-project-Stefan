//Exercise 5
//
//In the `en.coderslab.homeworks.Exceptions` package in the `Main05.java` file, place a method with the signature:
//
//`public static int indexOf(int[] elements, int value)`.
//
//1. Fill the method body so that it returns the index of the `value` element from the `elements` array.
//2. If the array does not have the specified element, return the `NoSuchElementException`.
//3. Test how the program works by calling the `indexOf` method with an element that is present in the array and with one that is not.
//4. When calling the `indexOf` method, add the exception handling of `NoSuchElementException`.
//5. Test how the program works again.

package en.coderslab.homeworks.Exceptions;

import java.util.NoSuchElementException;

public class Main05 {

    public static void main(String[] args) {
        int[] elements = {10, 20, 30, 40, 50}; // add 60,70,80 to see results

        // Testing indexOf method with an element that is present
        try {
            System.out.println("Index of 30: " + indexOf(elements, 30)); // Should print index 2
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }

        // Testing indexOf method with an element that is not present
        try {
            System.out.println("Index of 60: " + indexOf(elements, 60)); // Should throw NoSuchElementException
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Returns the index of the specified value in the elements array.
     *
     * @param elements - the array to search
     * @param value    - the value to find
     * @return the index of the value in the array
     * @throws NoSuchElementException if the value is not found
     */
    public static int indexOf(int[] elements, int value) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == value) {
                return i; // Return the index if found
            }
        }
        // If the value is not found, throw NoSuchElementException
        throw new NoSuchElementException("Element " + value + " not found in the array.");
    }
}