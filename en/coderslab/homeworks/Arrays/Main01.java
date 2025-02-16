package en.coderslab.homeworks.Arrays;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Main01 {
    public static void main(String[] args) {
        // Example usage
        int[] inputArray = {1, 1, 2, 3, 3, 4};
        int[] uniqueArray = returnUnique(inputArray);
        System.out.println(Arrays.toString(uniqueArray)); // Output: [1, 2, 3, 4]
    }

    public static int[] returnUnique(int[] arr) {
        LinkedHashSet<Integer> uniqueSet = new LinkedHashSet<>();

        for (int num : arr) {
            uniqueSet.add(num);
        }

        int[] uniqueArray = new int[uniqueSet.size()];
        int index = 0;
        for (int num : uniqueSet) {
            uniqueArray[index++] = num;
        }

        return uniqueArray; // Return the array of unique values
    }
}