package pl.coderslab.JavaExercisesDayTwoObjectOrientPrograming.Attributes;

public class Main01 {
    public static void main(String[] args) {

        AccessModifier testAttribute = new AccessModifier();


        testAttribute.publicAttribute = "I am public";
        testAttribute.protectedAttribute = "I am protected";
        testAttribute.setPrivateAttribute("I am private");

        // Displaying all attributes using the display method
        testAttribute.displayAttributes();


        System.out.println("\nChecking accessibility:");
        System.out.println("Public Attribute: " + testAttribute.publicAttribute); // Accessible
        System.out.println("Protected Attribute: " + testAttribute.protectedAttribute); // Accessible
        // The following line would cause a compilation error if uncommented
        // System.out.println("Private Attribute: " + testAttribute.privateAttribute); // Not accessible
    }
}