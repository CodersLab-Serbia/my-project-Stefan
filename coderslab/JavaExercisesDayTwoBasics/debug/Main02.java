package pl.coderslab.JavaExercisesDayTwoBasics.debug;

public class Main02 {
    public static void main(String[] args) {
        int number = 10; // Breakpoint 1: Inspect 'number' here
        int result = calculateSquare(number); // Breakpoint 2: Check before method call
        System.out.println("The square of " + number + " is: " + result); // Breakpoint 3: Inspect 'result' here
    }

    private static int calculateSquare(int num) { // Breakpoint 4: Inspect 'num' here
        return num * num; // Can inspect the calculation here as well
    }
}