## Exercise 1

Create an `Author` class that will meet the following requirements:

1. It should have private attributes:
* `id`
* `firstName`
* `lastName`
* `pseudonym`



## Exercise 2

Create a `Book` class that will meet the following requirements:

1. It will have private attributes:
* `id` - `int` type, holds the book ID,
* `title` - `String` type, determines the book title,
* `available` - `boolean` type, determines whether a book can be borrowed; with the default value set to `true` (the book can be borrowed), or e.g. in renovation - then it has the attribute with the value **false**.
* `author` - attribute of `Author` type,
* `additionalAuthors` - an array of `Author` class objects.

2. It should have getters for all fields.
3. It should have setters for all fields.


## Exercise 3

Create a `User` class that will meet the following requirements:
1. It should have private attributes:
* `id` - this attribute holds the ID,
* `firstName` - an attribute that specifies the user's name,
* `lastName` - an attribute that specifies the user's last name,
* `books` - an array of `Book` class objects.

2. Add the `addBook(Book book)` method, which will add a new book to the book array of the user.
3. Implement the ability to dynamically resize the array.


## Exercise 4

Create a `BankAccount` class that meets the following requirements:

1. It has private attributes:
* `number` - this attribute should hold the account ID (for simplicity you can assume that the account number can be any integer),
* `cash` - this attribute indicates the amount of money in the account. It should be a floating-point number. The `cash` attribute should always be set to 0 for a newly created account.

2. It has getters for the attributes `number` and `cash`, but does NOT have setters for them (we don't want a once created account to be able to change its number, and to the attribute `cash` we will add special functions to modify its value).

3. It has a `void depositCash(amount)` method whose role will be to increase the value of the `cash` attribute by the given value. Remember to check if the given value is:
* Greater than 0

4. It has a `double withdrawCash(amount)` method whose role will be to decrease the value of the `cash` attribute by the given value.
   This method should return the amount of money withdrawn. For simplicity, assume that the amount of money in the account must not go below 0, e.g. if you try to withdraw USD 500 from an account where there is USD 300, the method will only return USD 300.
   Remember to check if the given value is:
    * Greater than 0

5. It has a `String toString()` method with no parameters. This method should return information about the account number and its balance.