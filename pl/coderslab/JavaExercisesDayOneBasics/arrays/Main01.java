package pl.coderslab.JavaExercisesDayOneBasics.arrays;

public class Main01 {
    public static void main(String[] args) {
        // Created an array with consecutive integers from 0 to 49
        int[] mainTab = new int[50];
        for (int i = 0; i < mainTab.length; i++) {
            mainTab[i] = i; // Fill the array with values from 0 to 49
        }

        // Print the elements of the array, 10 per line
        for (int i = 0; i < mainTab.length; i++) {
            // Format the number with leading zeros
            System.out.printf("%02d ", mainTab[i]);
            // Print a new line after every 10 elements
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}