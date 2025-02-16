package en.coderslab.homeworks.HomeworkD2;



public class Author extends Person {
    // Constructor
    public Author(int id, String firstName, String lastName) {
        super(id, firstName, lastName); // Call to Person constructor
    }

    // Override toString method
    @Override
    public String toString() {
        return "Author{" +
                "id=" + getId() +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                '}';
    }
}

