package pl.coderslab.JavaExercisesDayTwoObjectOrientPrograming.Attributes;

public class Main02 {
    public static void main(String[] args) {
        // Creating an object of the AccessModifier class
        AccessModifier testAttribute = new AccessModifier();

        // Setting values for the accessible attributes
        testAttribute.publicAttribute = "I am public";
        testAttribute.protectedAttribute = "I am protected"; // Accessible within the same package
        testAttribute.setPrivateAttribute("I am private"); // Set through a public method

        // Displaying all attributes using the display method
        testAttribute.displayAttributes();
    }
}