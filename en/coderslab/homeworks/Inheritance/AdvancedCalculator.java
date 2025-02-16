//Exercise 1 - done with the lecturer
//
//Create a ```AdvancedCalculator```class which inherits from the ```Calculator``` class.
//The class should implement the following methods:
//
//1. ```pow(num1, num2)``` – the method should return ```num1``` raised to the power ```num2```.
//   Additionally, it should save in the operation table the following string: "```num1```^```num2``` equals ```result```".
//2. ```root(num1, num2)``` – the method should calculate the ```num2```th root of ```num1```.
//   Additionally, it should save in the operation table the following string: "```num2``` root of ```num1``` equals ```result```".

package en.coderslab.homeworks.Inheritance;

public class AdvancedCalculator extends Calculator {

    // Method to raise num1 to the power of num2
    public double pow(double num1, double num2) {
        double result = Math.pow(num1, num2);
        addOperation(num1 + "^" + num2 + " equals " + result);
        return result;
    }

    // Method to calculate the num2-th root of num1
    public double root(double num1, double num2) {
        if (num1 < 0 && num2 % 2 == 0) {
            throw new IllegalArgumentException("Cannot calculate even root of a negative number.");
        }
        double result = Math.pow(num1, 1.0 / num2);
        addOperation(num2 + " root of " + num1 + " equals " + result);
        return result;
    }
}