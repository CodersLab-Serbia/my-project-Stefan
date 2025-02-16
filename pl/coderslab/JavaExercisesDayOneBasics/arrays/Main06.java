package pl.coderslab.JavaExercisesDayOneBasics.arrays;

public class Main06
{
    public static void main(String[] args) {
        // Step 1: Created and array 'numbers' containing 10 numbers
        int[] numbers = {5, 12, 3, 8, 21, 14, 7, 19, 2, 11}; // Example array with 10 elements

        // Step 2: Created a second array  'secondNumbers' and fill it with 10 numbers
        int[] secondNumbers = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // Step 3: Created a third array to hold the sums of elements at the same index (rezultat od prve i druge)
        int[] sumArray = new int[numbers.length]; // Created an array of the same length

        for (int i = 0; i < numbers.length; i++) {
            sumArray[i] = numbers[i] + secondNumbers[i]; // Sum elements at the same index- Rezultat je zbir prvog i drugog ubacen u treci index
        }

        // Print the sum array
        System.out.print("Sum of corresponding elements: ");
        for (int sum : sumArray) {
            System.out.print(sum + " ");
        }
    }
}