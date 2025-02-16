//Exercise 1
//
//**Homework is based on the modification of exercises from the previous day. Previous solutions should not be modified, you can copy the contents of the classes.**
//
//
//Create a `Person` class that meets the following requirements:
//1. It should have private attributes:
//* `id` - this attribute should hold the ID,
//* `firstName` - an attribute that defines the author's name,
//* `lastName` - an attribute that specifies the author's last name,
//
//2. Define the appropriate inheritance between the `Author` class and the `Person` class.
//3. Define the appropriate inheritance between the `User` class and the `Person` class.
//4. Remove redundant parameters and methods.

package en.coderslab.homeworks.HomeworkD2;

public class Person {
    private int id;            // ID of the person
    private String firstName;  // First name of the person
    private String lastName;   // Last name of the person

    // Constructor
    public Person(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    // toString method for displaying person's information
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}