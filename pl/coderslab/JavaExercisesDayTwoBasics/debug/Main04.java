package pl.coderslab.JavaExercisesDayTwoBasics.debug;

public class Main04 {

    // Method to calculate the sum of elements
    public static int sum(int[] array) {
        int total = 0; // Initialize sum
        for (int i : array) {
            total += i; // Add each element to the total
        }
        return total; // Return the sum
    }

    public static void main(String[] args) {
        // Test Case 1: Empty array
        int[] test1 = {};
        System.out.println("Sum of test1: " + sum(test1)); // Expected: 0

        // Test Case 2: Positive numbers
        int[] test2 = {1, 2, 3, 4, 5};
        System.out.println("Sum of test2: " + sum(test2)); // Expected: 15

        // Test Case 3: Negative numbers
        int[] test3 = {-1, -2, -3};
        System.out.println("Sum of test3: " + sum(test3)); // Expected: -6

        // Test Case 4: Mixed numbers
        int[] test4 = {1, -1, 2, -2, 3};
        System.out.println("Sum of test4: " + sum(test4)); // Expected: 3
    }
}
//public class Main04 {
//
//
//    public static void main(String[] args) {
//        double sum = calculateSum(new String[]{"0", "1", "1", "2", "3", "5", "8"});
//        System.out.println("Sum " + sum);
//    }
//
//    private static double calculateSum(String[] input) {
//        double result = 0;
//        for (int i = 1; i < input.length; i++) {
//            result = Integer.parseInt(input[i]);
//        }
//        return result;
//    }
//}
