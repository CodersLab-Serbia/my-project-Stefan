package en.coderslab.homeworks.Inheritance;

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
    protected void addOperation(String operation) {
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