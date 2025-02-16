//package pl.coderslab.JavaExercisesDayTwoBasics.exceptions;
//
//public class Main03 {
//
//    public static void main(String[] args) {
//        // This line will cause a NullPointerException
//        String str = null;
//        System.out.println(str.length()); // Attempting to get the length of a null string
//    }
//}





 package pl.coderslab.JavaExercisesDayTwoBasics.exceptions;

public class Main03 {

    public static void main(String[] args) {
        // Initialize the string as null
        String str = null;

        // Check if the string is null before accessing its methods
        if (str != null) {
            System.out.println("Length of the string: " + str.length());
        } else {
            System.out.println("The string is null, cannot determine its length.");
        }
    }
} //