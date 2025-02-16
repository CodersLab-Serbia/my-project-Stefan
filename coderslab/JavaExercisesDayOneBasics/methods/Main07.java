package pl.coderslab.JavaExercisesDayOneBasics.methods;

public class Main07 {
    public static void main(String[] args) {
        // Example usage
        System.out.println(checkEvenOdd(5)); // Output: odd
    }

    public static String checkEvenOdd(int number) {
        return number % 2 == 0 ? "even" : "odd";
    }
}