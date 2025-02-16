package pl.coderslab.JavaExercisesDayOneBasics.arrays;
public class Main04 {
    public static void main(String[] args) {
        // Step 1: Create an array called 'numbers' containing the specified elements
        int[] numbers = {3, 5, 7, 2, 1}; // Array with specified elements

        // Step 2: Created an array variable 'reverse' and place elements of 'numbers' in reverse order
        int[] reverse = new int[numbers.length]; // Create an array of the same length

        for (int i = 0; i < numbers.length; i++) {
            reverse[i] = numbers[numbers.length - 1 - i]; // Reverse the elements
        }

        // Step 3:  This will print the elements of the 'reverse' array
        System.out.print("Reversed array: ");
        for (int i = 0; i < reverse.length; i++) {
            System.out.print(reverse[i]);
            if (i < reverse.length - 1) {
                System.out.print(", "); // Print comma between elements -ubacuje zarez izmedju elemenata
            }
        }
        System.out.println(); // New line at the end
    }
}