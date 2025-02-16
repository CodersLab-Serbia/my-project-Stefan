//Exercise2.
// Create a `Calculator` class. The constructor should not accept any data.
//Each newly created object should have a String array in which it will keep the history of its last operations (create it in the constructor - with an initial size of 0).
//Then add the following methods to the class:
//
//1. ```add(num1, num2)``` – the method should add two variables and return the result. Additionally, it should save the following string in the array of operations: "added ```num1``` to ```num2``` got ```result```".
//2. ```multiply(num1, num2)``` – the method should multiply two variables and return the result. Additionally, it should save the following string in the array of operations: "multiplied ```num1``` with ```num2``` got ```result```".
//3. ```subtract(num1, num2)``` – the method should subtract one variable from the other and return the result. Additionally, it should save the following string in the array of operations: "subtracted ```num1``` from ```num2``` got ```result```".
//4. ```divide(num1, num2)``` – the method should divide one variable by the other and return the result. Additionally, it should save the following string in the array of operations: "divided ```num1``` by ```num2``` got ```result```". Remember, you can't divide by zero.
//5. ```PrintOperations()``` – The method should print out all stored operations.
//6. ```clearOperations()``` – the method should clear all stored operations.
//
//You can add an auxiliary method that will add an entry to the list of operations and increase the array size by copying.
//
//Remember to use ```this``` in appropriate places.
//Create several calculators and test how they work.


package en.coderslab.homeworks.Constructor;

import java.util.Arrays;

public class Calculator {
    private String[] operations; // Array to store operation history
    private int operationCount;   // Current count of operations

    // Constructor
    public Calculator() {
        this.operations = new String[0]; // Initialize with size 0
        this.operationCount = 0;          // No operations initially
    }

    // Method to add two numbers
    public double add(double num1, double num2) {
        double result = num1 + num2;
        addOperation("added " + num1 + " to " + num2 + " got " + result);
        return result;
    }

    // Method to multiply two numbers
    public double multiply(double num1, double num2) {
        double result = num1 * num2;
        addOperation("multiplied " + num1 + " with " + num2 + " got " + result);
        return result;
    }

    // Method to subtract two numbers
    public double subtract(double num1, double num2) {
        double result = num1 - num2;
        addOperation("subtracted " + num1 + " from " + num2 + " got " + result);
        return result;
    }

    // Method to divide two numbers
    public double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        double result = num1 / num2;
        addOperation("divided " + num1 + " by " + num2 + " got " + result);
        return result;
    }

    // Method to add an operation to history
    private void addOperation(String operation) {
        operations = Arrays.copyOf(operations, operations.length + 1); // Increase array size
        operations[operations.length - 1] = operation; // Add new operation
        operationCount++;
    }

    // Method to print all stored operations
    public void printOperations() {
        if (operationCount == 0) {
            System.out.println("No operations recorded.");
            return;
        }
        for (String operation : operations) {
            System.out.println(operation);
        }
    }

    // Method to clear all stored operations
    public void clearOperations() {
        operations = new String[0]; // Reset operations to size 0
        operationCount = 0;         // Reset operation count
    }
}