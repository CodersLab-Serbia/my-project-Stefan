// Exercise 4
//
//Create an `Employee` class that will have:
//
//1. public attributes:
//* `id` - an attribute containing information about the employee's identification number,
//* `firstName`– an attribute that defines the employee's first name,
//* `lastName`–an attribute that defines the employee's last name,
//* `wage` - an attribute that defines the employee's hourly wage,
//2. a constructor that takes: id, first name, last name, and hourly wage,
//3. a method named `raiseWage(percent)`, which increases the value of the `wage` attribute by the given percentage.

package en.coderslab.homeworks.Inheritance;

public class Employee {
    public int id;           // Employee ID
    public String firstName; // Employee first name
    public String lastName;  // Employee last name
    public double wage;      // Hourly wage

    // Constructor
    public Employee(int id, String firstName, String lastName, double wage) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.wage = wage;
    }

    // Method to raise wage by a given percentage
    public void raiseWage(double percent) {
        if (percent >= 0) {
            wage += wage * (percent / 100);
        } else {
            throw new IllegalArgumentException("Percentage must be non-negative.");
        }
    }
}