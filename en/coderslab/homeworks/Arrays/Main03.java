package en.coderslab.homeworks.Arrays;

public class Main03 {
    public static void main(String[] args) {
        // Example usage
        int[] inputArray = {1, 2, 3, 4, 5};
        System.out.println(contains(inputArray, 2)); // Output: true when contain  inputArray = {1, 2, 3, 4, 5};
        System.out.println(contains(inputArray, 6)); // Output: false when number isnt from input array = inputArray = {1, 2, 3, 4, 5};
    }

    public static boolean contains(int[] arr, int element) {
        for (int num : arr) {
            if (num == element) {
                return true; // Element found trojka je navedena
            }
        }
        return false; // Element not found Sestice nema pa je zbog toga false
    }
}
