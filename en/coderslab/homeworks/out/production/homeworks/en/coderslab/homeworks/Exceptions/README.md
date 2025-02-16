## Exercise 1

In the `pl.coderslab.homeworks.exceptions` package in the `pl.coderslab.homeworks.Exceptions.Main01.java` file, place a method with the signature:

`public static void average(String a, String b)`.

1. Fill the body of the method so that it converts the variables `a` and `b` to an `int` numeric type, and divides variable `a` by variable `b`.
2. Protect the program from possible errors.
3. Add a section that will always be executed regardless of whether an error occurs or not.
4. Keep in mind the `ArithmeticException` error.
5. Change the type of variables `a` and `b` to `double` and see what results you get when you divide by `0`.

Read the articles:  
[https://www.geeksforgeeks.org/g-fact-33-infinity-or-exception/](https://www.geeksforgeeks.org/g-fact-33-infinity-or-exception/)
[https://docs.oracle.com/javase/specs/jls/se7/html/jls-15.html#jls-15.17.2](https://docs.oracle.com/javase/specs/jls/se7/html/jls-15.html#jls-15.17.2)


## Exercise 2

In the `pl.coderslab.homeworks.exceptions` package in the `Main02.java` file, place a method with the signature:

`public static String safeGet(String[] strTab, int index)`.

1. Fill the body of the method so that it returns the element of the `strTab` array contained under the given `index`.
2. Add handling for the appropriate exception.
3. Test how the program works.


## Exercise 3

In the `pl.coderslab.homeworks.exceptions` package in the `Main03.java`file, place a method with the signature:

`public static int getLength(String str)`.

1. Fill the body of the method so that it returns the length of the `str` string.
2. Test the method by passing a parameter with the value of `null` to it.
3. Protect the program from the `NullPointerException`.


## Exercise 4

In the `pl.coderslab.homeworks.exceptions` package in the `Main04.java`file, place a method with the signature:

`public static int toInt(String str)`.

1. Fill the body of the method so that it returns the `str` string converted to `int` type.
2. Handle the possible exceptions.


## Exercise 5

In the `pl.coderslab.homeworks.exceptions` package in the `Main05.java` file, place a method with the signature:

`public static int indexOf(int[] elements, int value)`.

1. Fill the method body so that it returns the index of the `value` element from the `elements` array.
2. If the array does not have the specified element, return the `NoSuchElementException`.
3. Test how the program works by calling the `indexOf` method with an element that is present in the array and with one that is not.
4. When calling the `indexOf` method, add the exception handling of `NoSuchElementException`.
5. Test how the program works again.