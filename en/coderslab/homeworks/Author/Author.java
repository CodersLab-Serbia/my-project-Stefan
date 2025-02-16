package en.coderslab.homeworks.Author;

public class Author {
    private int id;
    private String firstName;
    private String lastName;
    private String pseudonym;

    public Author(int id, String firstName, String lastName, String pseudonym) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.pseudonym = pseudonym;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPseudonym() {
        return pseudonym;
    }
}