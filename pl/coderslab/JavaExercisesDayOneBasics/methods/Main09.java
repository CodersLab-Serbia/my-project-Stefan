package pl.coderslab.JavaExercisesDayOneBasics.methods;

public class Main09 {
    public static void main(String[] args) {
        // Example usage
        System.out.println(factorial(5)); // Output: 120
    }

    public static long factorial(int n) {
        if (n == 0) return 1; // 0! = 1
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}