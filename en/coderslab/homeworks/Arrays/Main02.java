package en.coderslab.homeworks.Arrays;

import java.util.Arrays;

public class Main02 {
    public static void main(String[] args) {
        // Example usage
        int[] inputArray = {1, 2, 3};
        int[] appendedArray = append(inputArray);
        System.out.println(Arrays.toString(appendedArray)); // Output: [1, 2, 3, 3, 2, 1]
    }

    public static int[] append(int[] arr) {
        int[] arrTmp = new int[arr.length * 2];

        // Copy original elements
        for (int i = 0; i < arr.length; i++) {
            arrTmp[i] = arr[i];
        }

        // Fill the rest with elements in reverse order
        for (int i = 0; i < arr.length; i++) {
            arrTmp[arr.length + i] = arr[arr.length - 1 - i];
        }

        return arrTmp; // Return the completed array
    }
}
