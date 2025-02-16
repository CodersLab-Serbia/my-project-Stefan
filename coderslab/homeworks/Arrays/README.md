## Exercise 1

In the `pl.coderslab.homeworks.arrays` package in the `Main01.java`file place a method with the signature:

`public static int[] returnUnique(int[] arr)`.

Fill in the body of the method in such a way that it selects only unique values from the `arr` array, which are then returned from the method.

For example, for the array [1,1,2,3,3,4], we should get [1,2,3,4].


## Exercise 2

In the `pl.coderslab.homeworks.arrays` package in the `Main02.java`file place a method with the signature:

`public static int[] append(int[] arr)`.

1. Fill the body of the method so that for the received array its contents are copied to a temporary array, which should be 2 times the size of the array given.
2. Fill the missing elements of the temporary array with the elements of the original array in reverse order.
3. The method should return the copied and completed array.

Example:
for array int arr[] = {1,2,3};
the array int arrTmp[] = {1,2,3,3,2,1} should be returned;


## Exercise 3

In the `pl.coderslab.homeworks.arrays` package in the `Main03.java`file, place a method with the signature:

`public static boolean contains(int[] arr, int element)`.

1. Complete the body of the method so that it checks if the `element` exists in the array `arr`,
2. if so, it should return `true`,
3. if not, it should return `false`.