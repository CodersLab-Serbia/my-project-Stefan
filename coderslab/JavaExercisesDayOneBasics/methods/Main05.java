package pl.coderslab.JavaExercisesDayOneBasics.methods;

public class Main05 {
    public static void main(String[] args) {
        // Example usage
        System.out.println(calculateNet(120, 0.2)); // Output: 100.0
    }

    public static double calculateNet(double gross, double vat) {
        // Net price calculation
        return gross / (1 + vat);
    }
}