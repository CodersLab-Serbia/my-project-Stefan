//Exercise 3
//
//Create a `Person` class, add the following attributes to it:
//
//- name,
//- surname,
//- age,
//- gender.
//
//All attributes have to be private.
//
//1. Create a constructor that will take and set the parameters: `name`, `surname`.
//2. Create a constructor that will take and set the parameters: `name`, `age`.
//3. Create a constructor that will take and set the parameters: `name`, `surname`, `age`, `gender`.

package en.coderslab.homeworks.Constructor;

public class Person {
    // Private attributes
    private String name;
    private String surname;
    private int age;
    private String gender;

    // Constructor that accepts name and surname
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.age = 0; // Default age
        this.gender = ""; // Default gender
    }

    // Constructor that accepts name and age
    public Person(String name, int age) {
        this.name = name;
        this.surname = ""; // Default surname
        this.age = age;
        this.gender = ""; // Default gender
    }

    // Constructor that accepts name, surname, age, and gender
    public Person(String name, String surname, int age, String gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    // Getters for accessing private attributes
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    // toString method for displaying person information
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}


