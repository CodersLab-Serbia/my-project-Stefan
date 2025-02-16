//Exercise 2
//
//Create a `Shape` class that will have:
//
//1. private attributes `x` and `y` (defining the center of this shape) and `color`,
//2. a constructor that accepts variables defining values of `x`, `y` and `color`,
//3. a method named `getDescription()` that will display information about this shape, returning a value of the `String` type,
//4. a method called `getDistance(Shape shape)`, which returns a distance from the center of another shape. The result should be of the `double` type.
//
//Check what happens when you change access to individual functions from public to private.
package en.coderslab.homeworks.Inheritance;

public class Shape {
    protected double x;      // x-coordinate of the center
    protected double y;      // y-coordinate of the center
    protected String color;  // Shape color

    // Constructor
    public Shape(double x, double y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    // Method to get a description of the shape
    public String getDescription() {
        return "Shape at (" + x + ", " + y + ") with color " + color;
    }

    // Method to calculate distance to another shape
    public double getDistance(Shape shape) {
        return Math.sqrt(Math.pow(this.x - shape.x, 2) + Math.pow(this.y - shape.y, 2));
    }
}