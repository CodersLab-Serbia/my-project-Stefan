package pl.coderslab.JavaExercisesDayOneBasics.arrays;

import java.util.Random;

public class Main02 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] randNumbers = new int[20];

        // Step 1: Fill the array with random numbers from 0 to 100
        for (int i = 0; i < randNumbers.length; i++) {
            randNumbers[i] = random.nextInt(101); // Generates a random number between 0 and 100
        }

        // Step 2: Find the minimum value in the array
        int minValue = randNumbers[0]; // Initialize minValue with the first element

        for (int i = 1; i < randNumbers.length; i++) {
            if (randNumbers[i] < minValue) {
                minValue = randNumbers[i]; // Update minValue if a smaller number is found
            }
        }

        // Step 3: Print the minimum value
        System.out.println("The minimum value in the array is: " + minValue);
    }
}