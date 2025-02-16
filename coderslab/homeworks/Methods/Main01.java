

package en.coderslab.homeworks.methods;

public class Main01 {
    public static void main(String[] args) {
        // Example usage
        double dogAgeInHumanYears = dogAge(3.0); // Change the age as needed
        System.out.println("Dog's age in human years: " + dogAgeInHumanYears);
    }

    public static double dogAge(double dogAge) {
        if (dogAge < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }

        if (dogAge <= 2) {
            return dogAge * 10.5;
        } else {
            return (2 * 10.5) + ((dogAge - 2) * 4);
        }
    }
}
