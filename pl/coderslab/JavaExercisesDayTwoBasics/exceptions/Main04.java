package pl.coderslab.JavaExercisesDayTwoBasics.exceptions;


public class Main04 {

    public static void main(String[] args) throws ArithmeticException {
        int a = 1, b = 0, c;
        try {
            c = a / b;
            System.out.println(c);

        } catch (Exception ex) {
            System.out.println("Exception");

        }


    }}
