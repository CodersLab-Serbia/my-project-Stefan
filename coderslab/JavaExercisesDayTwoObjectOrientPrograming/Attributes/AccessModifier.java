package pl.coderslab.JavaExercisesDayTwoObjectOrientPrograming.Attributes;

public class AccessModifier {

    public String publicAttribute;
    public String protectedAttribute;
    private String privateAttribute;




    public void setPrivateAttribute(String value) {
        this.privateAttribute = value;
    }


    public void displayAttributes() {
        System.out.println("Public Attribute: " + publicAttribute);
        System.out.println("Protected Attribute: " + protectedAttribute);
        System.out.println("Private Attribute: " + privateAttribute);
    }
}