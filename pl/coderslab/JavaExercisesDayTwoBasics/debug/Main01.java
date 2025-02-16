package pl.coderslab.JavaExercisesDayTwoBasics.debug;

public class Main01 {

    public static void main(String[] args) {
        int x = 33 * 55; // Breakpoint 1: Inspect variable x
        String text = "abcd" + " " + x; // Breakpoint 2: Inspect the text variable
        Foo.bar(); // Step into this method
        boolean isTrue = !false;

        char c = 'x'; // Breakpoint 3: Inspect variable c
    }
}