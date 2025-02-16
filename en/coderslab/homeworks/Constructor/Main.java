package en.coderslab.homeworks.Constructor;

public class Main {
    public static void main(String[] args) {
        // Testing the Burger class
        Burger burger1 = new Burger("Large", 8.99);
        Burger burger2 = new Burger();
        System.out.println(burger1);
        System.out.println(burger2);

        // Testing the Calculator class
        Calculator calculator = new Calculator();
        calculator.add(5, 3);
        calculator.multiply(4, 2);
        calculator.subtract(10, 4);
        calculator.divide(20, 5);
        System.out.println("\nCalculator Operations:");
        calculator.printOperations();

        // Clear operations and print again
        calculator.clearOperations();
        System.out.println("\nAfter clearing operations:");
        calculator.printOperations();

        // Testing the Person class
        Person person1 = new Person("John", "Doe");
        Person person2 = new Person("Alice", 30);
        Person person3 = new Person("Bob", "Smith", 25, "Male");
        System.out.println("\nPerson Details:");
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}