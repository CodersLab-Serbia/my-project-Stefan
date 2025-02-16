package pl.coderslab.JavaExercisesDayOneBasics.arrays;

import java.util.Arrays;

 public class Main03 {
    public static void main(String[] args) {
        // Step 1: Created a 10-element array and fill it with the value "2"
        String[] array = new String[10];
        Arrays.fill(array, "2"); // Fill the array with the string "2"

        // Step 2: Print the array
        System.out.println(Arrays.toString(array)); // Rezultat - Outputs: [2, 2, 2, 2, 2, 2, 2, 2, 2, 2]
    }
 }
