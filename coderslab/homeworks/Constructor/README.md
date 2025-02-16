## Exercise 1 - done with the lecturer

Create a `Burger` class, add the following attributes to it:

- size,
- price.

1. Create a constructor that will accept and set the `size` and `price` parameters.
2. Create a no-argument constructor.



## Exercise 2

Create a `Calculator` class. The constructor should not accept any data.
Each newly created object should have a String array in which it will keep the history of its last operations (create it in the constructor - with an initial size of 0).
Then add the following methods to the class:

1. ```add(num1, num2)``` – the method should add two variables and return the result. Additionally, it should save the following string in the array of operations: "added ```num1``` to ```num2``` got ```result```".
2. ```multiply(num1, num2)``` – the method should multiply two variables and return the result. Additionally, it should save the following string in the array of operations: "multiplied ```num1``` with ```num2``` got ```result```".
3. ```subtract(num1, num2)``` – the method should subtract one variable from the other and return the result. Additionally, it should save the following string in the array of operations: "subtracted ```num1``` from ```num2``` got ```result```".
4. ```divide(num1, num2)``` – the method should divide one variable by the other and return the result. Additionally, it should save the following string in the array of operations: "divided ```num1``` by ```num2``` got ```result```". Remember, you can't divide by zero.
5. ```PrintOperations()``` – The method should print out all stored operations.
6. ```clearOperations()``` – the method should clear all stored operations.

You can add an auxiliary method that will add an entry to the list of operations and increase the array size by copying.

Remember to use ```this``` in appropriate places.
Create several calculators and test how they work.


## Exercise 3

Create a `Person` class, add the following attributes to it:

- name,
- surname,
- age,
- gender.

All attributes have to be private.

1. Create a constructor that will take and set the parameters: `name`, `surname`.
2. Create a constructor that will take and set the parameters: `name`, `age`.
3. Create a constructor that will take and set the parameters: `name`, `surname`, `age`, `gender`.
