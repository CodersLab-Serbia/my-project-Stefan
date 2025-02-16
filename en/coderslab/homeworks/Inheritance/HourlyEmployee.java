//Exercise 5
//
//Create a class named `HourlyEmployee`, representing an employee who is paid by the employer by the hour.
//The class must meet the following requirements:
//
//1. it inherits from the class `Employee`,
//2. it has an additional method named `calculatePayment(hours)` that returns the amount to be paid to the employee for the number of hours they worked.

package en.coderslab.homeworks.Inheritance;

public class HourlyEmployee extends Employee {

    // Constructor
    public HourlyEmployee(int id, String firstName, String lastName, double wage) {
        super(id, firstName, lastName, wage);
    }

    // Method to calculate payment based on hours worked
    public double calculatePayment(double hours) {
        return wage * hours;
    }
}