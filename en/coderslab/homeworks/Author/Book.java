package en.coderslab.homeworks.Author;

public class Book {
    private int id;                        // Holds the book ID
    private String title;                  // Determines the book title
    private boolean available = true;      // Determines if the book can be borrowed
    private Author author;                 // Main author of the book
    private Author[] additionalAuthors;    // Array of additional authors

    public Book(int id, String title, boolean available, Author author, Author[] additionalAuthors) {
        this.id = id;
        this.title = title;
        this.available = available;
        this.author = author;
        this.additionalAuthors = additionalAuthors;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    // Other getters and setters can be added here
}