## Exercise 1 - done with the lecturer

In the `Main01.java` file write a method with the signature:

`public static int multiply(int multiplier, int index)`,

which returns the value of the `multiplier` variable multiplied by the value of the `index` argument.


## Exercise 2

In the `Main02.java` file write a method with the signature: 

`public static int square(int num)`, 

which will return the `num` value raised to the second power.


## Exercise 3

In the file `Main03.java` write a public method `convertToUsd`, that takes the `eur` parameter, i.e. an amount in euros.
The method should return the amount in US dollars. 

The conversion rate is 0.83 EUR = 1 USD.


## Exercise 4

In the file `Main04.java` write a public method named `createName` which will take the following parameters:

* `name`,
* `surname`,
* `nickname`.

The method should return a text string with the connected parameters in the form: "name nickname surname".


## Exercise 5

In the file `Main05.java` write the public method `calculateNet` which will take the following parameters:

* `gross`: gross purchase price,
* `vat`: value of VAT. You can assume that VAT will be a floating-point number from the range: 0 - 1.

The method should return the net price value. In a comment, write what calculations you have to make.


## Exercise 6

In the file `Main06.java` write a public method `checkMaturity` which will take the following parameters:

* will take the numerical parameter `age` indicating the age of the user,
* will check if the user is adult,
* will return `true` - if the user is adult,
* will return `false` - if the user is underage.


## Exercise 7

In the file `Main07.java` write a public method `checkEvenOdd` which will do the following:

* will accept the numerical parameter `number`,
* will return a value of the `String` type,
* will return "even" if the number is even,
* will return "odd" if the number is odd.


## Exercise 8

In the file `Main08.java` write a public method `maxOfThree` which will take three numeric parameters. The method should return the greatest of these numbers.



## Exercise 9

In the file `Main09.java` write a public method `factorial` which will take a natural number `n` as a parameter. 

The method should return the value `n!`, which is the result of multiplying all natural numbers within the range: `1...n`.


## Exercise 10* (additional)

When football club A plays a two-legged tie with football club B, it means that they play one match on the field of team A and one on the field of team B.

The team that scores more goals in both games wins.

If the teams have scored the same number of goals, the goals scored away (not on home field) count as "slightly more important", and the winner is the team that scored more goals away.

A draw in a two-legged tie is when both teams have scored the same number of goals and have the same number of goals away.

----
**Example:**

Two teams play in the Weather Cup: `Thunder` and `Lightning`. The teams played the following matches:

**The host: `Thunder`.**

`Thunder` 0:2 `Lightning`

**The host: `Lightning`.**

`Lightning` 1:3 `Thunder`

The total score for the two games is 3:3. However, `Thunder` scored 3 goals in their away match, while `Lightning` only 2. Therefore, `Thunder` wins.

----

Write a method named `footballWin` that will take the following parameters:

* goals scored by team A in the first match (on the field of team A),
* goals scored by team B in the first match (on the field of team A),
* goals scored by team A in the second match (on the field of team B),
* goals scored by team B in the second match (on the field of team B),

and return `1` if the winner of the two-legged tie is A, and `2` - if B. In the case of a draw, return `X`.
The result should be a text string, not a number!
