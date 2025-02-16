## Exercise 1

**Homework is based on the modification of exercises from the previous day. Previous solutions should not be modified, you can copy the contents of the classes.**


Create a `Person` class that meets the following requirements:
1. It should have private attributes:
* `id` - this attribute should hold the ID,
* `firstName` - an attribute that defines the author's name,
* `lastName` - an attribute that specifies the author's last name,

2. Define the appropriate inheritance between the `Author` class and the `Person` class.
3. Define the appropriate inheritance between the `User` class and the `Person` class.
4. Remove redundant parameters and methods.



## Exercise 2

Create a `SoundBook` class that meets the following requirements:
1. It should have private attributes:
* `duration` - this attribute should store the length of recordings,
* `numberOfCarriers` - an attribute that specifies the number of media (CDs, cassettes) that are contained within a single book.

2. Define the appropriate inheritance between the `SoundBook` class and the `Book` class.


## Exercise 3

Modify the `Book` class:

1. Add the private attribute `popularity` that will store the number of book loans, this number should increase by 1 with each loan.
2. Define the `equals(Book book)` method which will return information whether the objects are equal based on the `id` attribute.



## Exercise 4

Modify the `User` class:

1. Add a `returnBook(Book book)` method that accepts the `Book` class object which will mark the book as available for borrowing by changing the attribute `available` to `true`,
   and will also remove the `Books` object from the `books` array of the `User` object.
2. Add the `returnAllBooks()` method which will return all borrowed books.

