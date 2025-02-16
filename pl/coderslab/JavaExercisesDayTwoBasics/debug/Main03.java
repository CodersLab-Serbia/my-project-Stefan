package pl.coderslab.JavaExercisesDayTwoBasics.debug;

public class Main03 {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        for (int i = 1000; i >= 0; i--) {
            b = i < 9995 ? a / i : a * i; // Breakpoint 1: Set here to inspect b
        }
        System.out.println(b);
    }
}