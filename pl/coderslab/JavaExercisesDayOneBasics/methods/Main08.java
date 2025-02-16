package pl.coderslab.JavaExercisesDayOneBasics.methods;

public class Main08 {
    public static void main(String[] args) {
        // Example usage
        System.out.println(maxOfThree(5, 10, 3)); // Output: 10
    }

    public static int maxOfThree(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}