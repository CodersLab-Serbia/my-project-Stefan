//Exercise 2
//
//In the `pl.coderslab.homeworks.exceptions` package in the `Main02.java` file, place a method with the signature:
//
//`public static String safeGet(String[] strTab, int index)`.
//
//1. Fill the body of the method so that it returns the element of the `strTab` array contained under the given `index`.
//2. Add handling for the appropriate exception.
//3. Test how the program works.

package en.coderslab.homeworks.Exceptions;

public class Main02 {
    public static void main(String[] args) {
        String[] strTab = {"Apple", "Banana", "Cherry"};

        // Testing safeGet method with valid and invalid indices
        System.out.println(safeGet(strTab, 0)); // Valid case: should print "Apple"
        System.out.println(safeGet(strTab, 1)); // Valid case: should print "Banana"
        System.out.println(safeGet(strTab, 1)); // Valid case: should print "Banana"
        System.out.println(safeGet(strTab, 2)); // Valid case: should print "Cherry"
        System.out.println(safeGet(strTab, 3)); // Invalid case: should handle ArrayIndexOutOfBoundsException
    }

    /**
     * Returns the element of the strTab array at the specified index.
     *
     * @param strTab - the array of strings
     * @param index  - the index of the element to retrieve
     * @return the element at the specified index or an error message if the index is out of bounds
     */
    public static String safeGet(String[] strTab, int index) {
        try {
            // Attempt to return the element at the given index
            return strTab[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the exception and return a message
            return "Index out of bounds: " + index;
        }
    }
}