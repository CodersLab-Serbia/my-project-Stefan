package pl.coderslab.JavaExercisesDayOneBasics.methods;

public class Main03 {
    public static void main(String[] args) {
        // Example usage
        System.out.println(convertToUsd(10)); // Output: 12.05 -Result
    }

    public static double convertToUsd(double eur) {
        return eur / 0.83;
    }
}