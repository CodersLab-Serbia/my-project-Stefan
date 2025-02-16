package en.coderslab.homeworks.Inheritance;

public class Main {
    public static void main(String[] args) {
        // Test AdvancedCalculator
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        System.out.println("2^3 = " + advancedCalculator.pow(2, 3));
        System.out.println("3 root of 27 = " + advancedCalculator.root(27, 3));

        // Test Shape and Circle
        Shape shape1 = new Shape(0, 0, "Red");
        Circle circle1 = new Circle(1, 1, "Blue", 5);
        System.out.println(shape1.getDescription());
        System.out.println(circle1.getDescription());
        System.out.println("Distance between shapes: " + shape1.getDistance(circle1));

        // Test Employee, HourlyEmployee, and SalariedEmployee
        Employee emp1 = new Employee(1, "John", "Doe", 15.0);
        HourlyEmployee hourlyEmp = new HourlyEmployee(2, "Jane", "Smith", 20.0);
        SalariedEmployee salariedEmp = new SalariedEmployee(3, "Bob", "Brown", 3000.0);

        System.out.println("Hourly Employee Payment for 40 hours: " + hourlyEmp.calculatePayment(40));
        System.out.println("Salaried Employee Monthly Payment: " + salariedEmp.calculatePayment());

        // Raise wage and test
        emp1.raiseWage(10); // 10% raise
        System.out.println("Employee new wage: " + emp1.wage);
    }
}