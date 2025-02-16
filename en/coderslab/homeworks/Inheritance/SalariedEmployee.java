//Exercise 6
//
//Create a class named `SalariedEmployee` that represents an employee who is paid by the employer per month.
//
//The class should:
//1. inherit from the class `Employee`,
//2. have an additional method named `calculatePayment()` that will return the amount to be paid to the employee for the month worked
//   (for simplicity, you can assume that there are 190 working hours each month - use `final static`).

package en.coderslab.homeworks.Inheritance;

public class SalariedEmployee extends Employee {
    public static final int WORKING_HOURS_PER_MONTH = 190; // Static constant for working hours

    // Constructor
    public SalariedEmployee(int id, String firstName, String lastName, double wage) {
        super(id, firstName, lastName, wage);
    }

    // Method to calculate monthly payment
    public double calculatePayment() {
        return wage * WORKING_HOURS_PER_MONTH;
    }
}