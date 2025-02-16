## Exercise 1 - done with the lecturer

Create a ```AdvancedCalculator```class which inherits from the ```Calculator``` class.
The class should implement the following methods:

1. ```pow(num1, num2)``` – the method should return ```num1``` raised to the power ```num2```.
   Additionally, it should save in the operation table the following string: "```num1```^```num2``` equals ```result```".
2. ```root(num1, num2)``` – the method should calculate the ```num2```th root of ```num1```.
   Additionally, it should save in the operation table the following string: "```num2``` root of ```num1``` equals ```result```".


## Exercise 2

Create a `Shape` class that will have:

1. private attributes `x` and `y` (defining the center of this shape) and `color`,
2. a constructor that accepts variables defining values of `x`, `y` and `color`,
3. a method named `getDescription()` that will display information about this shape, returning a value of the `String` type,
4. a method called `getDistance(Shape shape)`, which returns a distance from the center of another shape. The result should be of the `double` type.

Check what happens when you change access to individual functions from public to private.


## Exercise 3

Create a `Circle` class that meets the following requirements:

1. it inherits from the class that defines shape (`Shape`),
2. has an additional attribute named `radius`,
3. has a constructor that accept variables defining values of `x`, `y`, `color`, and `radius`,
4. overrides the `getDescription()` method of the shape,
5. has a method called `getArea()` that returns the area (`double` type),
6. has a method called `getCircuit()` that returns the circuit of the `double` type).

Test the `getDistance(Shape shape)` method on objects of the `Circle` type.


## Exercise 4

Create an `Employee` class that will have:

1. public attributes:
* `id` - an attribute containing information about the employee's identification number,
* `firstName`– an attribute that defines the employee's first name,
* `lastName`–an attribute that defines the employee's last name,
* `wage` - an attribute that defines the employee's hourly wage,
2. a constructor that takes: id, first name, last name, and hourly wage,
3. a method named `raiseWage(percent)`, which increases the value of the `wage` attribute by the given percentage.

Remember to check if the value given is equal to or greater than 0.


## Exercise 5

Create a class named `HourlyEmployee`, representing an employee who is paid by the employer by the hour.
The class must meet the following requirements:

1. it inherits from the class `Employee`,
2. it has an additional method named `calculatePayment(hours)` that returns the amount to be paid to the employee for the number of hours they worked.


## Exercise 6

Create a class named `SalariedEmployee` that represents an employee who is paid by the employer per month.

The class should:
1. inherit from the class `Employee`,
2. have an additional method named `calculatePayment()` that will return the amount to be paid to the employee for the month worked
   (for simplicity, you can assume that there are 190 working hours each month - use `final static`). 