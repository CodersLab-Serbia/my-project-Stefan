package pl.coderslab.JavaExercisesDayTwoObjectOrientPrograming.Methods;

public class Main04 {
    public static void main(String[] args) {
        // Example usage
        System.out.println(createName("Stefan", "Bajic", "shtefek")); // Output: Stefan shtefek Bajic
    }

    // Method to create a full name
    public static String createName(String name, String surname, String nickname) {
        return name + " " + nickname + " " + surname;
    }
}