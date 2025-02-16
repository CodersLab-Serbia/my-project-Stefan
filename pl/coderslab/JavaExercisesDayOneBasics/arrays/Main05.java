package pl.coderslab.JavaExercisesDayOneBasics.arrays;

import java.util.Arrays;

public class Main05 {
    public static void main(String[] args) {

        int[] numbers = {12, 5, 7, 3, 9, 1, 4, 10, 8, 6};


        Arrays.sort(numbers);


        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
}