## Exercise 1 - done with the lecturer

The `Main01.java` file contains a method with the signature `public static int factorial(int number)`
that returns the factorial of the integer passed in the parameter.

1. Modify the code so that the method returns an `IllegalArgumentException` exception if the `number` passed in the parameter is less than zero.
2. Pay attention to whether it is a checked or unchecked exception and why.
3. Test how the program works by calling the `factorial` method with a correct and an incorrect parameter.
4. When calling the `factorial` method, add the exception handling for `NoSuchElementException`.
5. Test the program again.


## Exercise 2

The file `Main02.java` contains a program that causes throwing an exception.
1. Run the program and see what exception is thrown.
2. Add handling for the appropriate exception to the code and restart the program.
3. Pay attention to whether it is a checked or unchecked exception and why.


## Exercise 3

The file `Main03.java` contains a program that causes an exception to be thrown.
1. Run the program and see what exception is thrown.
2. Modify the code to protect it from exception throwing - modify code to make sure that this exception is not thrown here.



## Exercise 4

The file `Main04.java` contains a program with handling of two exceptions.

1. Run the program and see what exception is returned.
2. Delete the comment and fix the code so that the additional exception from the comment is correctly handled.
1. Restart the program and see what exception is returned now.


## Exercise 5

The file `Main05.java` contains a program that returns an exception.
1. Run the program and see what exception is returned.
2. Add the handling of the appropriate exception to the code.
3. Add a section to the code that will be executed regardless of whether the exception is thrown.
4. Test the program by calling the `parseInt` method with a correct and an incorrect parameter.


## Exercise 6

The `Main06.java` file contains a method with the signature: 

`public static int divide (int a, int b)`.

1. Fill the body of the method so that it performs the division of the parameter `a` by `b` and returns the total part of the result.
2. Call the `divide` method passing the parameter `b` with the value of `0` to it and see which exception is returned after the program is launched.
3. Modify the code so that the `divide` method returns an `IllegalArgumentException` exception when `b` is equal to `0`.
4. Restart the program and see what exception is returned.
5. In the `main` method, add the exception handling for `IllegalArgumentException`.
6. Test the program by passing a correct and an incorrect parameter `b` to the `divide` method.
