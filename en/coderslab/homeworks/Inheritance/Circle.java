//Exercise 3
//
//Create a `Circle` class that meets the following requirements:
//
//1. it inherits from the class that defines shape (`Shape`),
//2. has an additional attribute named `radius`,
//3. has a constructor that accept variables defining values of `x`, `y`, `color`, and `radius`,
//4. overrides the `getDescription()` method of the shape,
//5. has a method called `getArea()` that returns the area (`double` type),
//6. has a method called `getCircuit()` that returns the circuit of the `double` type).
//
//Test the `getDistance(Shape shape)` method on objects of the `Circle` type.

package en.coderslab.homeworks.Inheritance;

public class Circle extends Shape {
    private double radius; // Radius of the circle

    // Constructor
    public Circle(double x, double y, String color, double radius) {
        super(x, y, color);
        this.radius = radius;
    }

    // Override getDescription method
    @Override
    public String getDescription() {
        return "Circle at (" + super.x + ", " + super.y + ") with color " + super.color + " and radius " + radius;
    }

    // Method to calculate area
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    // Method to calculate circumference
    public double getCircuit() {
        return 2 * Math.PI * radius;
    }
}