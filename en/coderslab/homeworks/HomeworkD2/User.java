//## Exercise 4
//
//Modify the `User` class:
//
//1. Add a `returnBook(Book book)` method that accepts the `Book` class object which will mark the book as available for borrowing by changing the attribute `available` to `true`,
//   and will also remove the `Books` object from the `books` array of the `User` object.
//2. Add the `returnAllBooks()` method which will return all borrowed books.


package en.coderslab.homeworks.HomeworkD2;

import java.util.ArrayList;

public class User extends Person {
    private ArrayList<Book> books; // List of borrowed books

    // Constructor
    public User(int id, String firstName, String lastName) {
        super(id, firstName, lastName); // Call to Person constructor
        this.books = new ArrayList<>();
    }

    // Method to borrow a book
    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            books.add(book);
            book.setAvailable(false);
        }
    }

    // Method to return a book
    public void returnBook(Book book) {
        if (books.remove(book)) {
            book.setAvailable(true);
        }
    }

    // Method to return all borrowed books
    public ArrayList<Book> returnAllBooks() {
        ArrayList<Book> borrowedBooks = new ArrayList<>(books);
        books.clear(); // Clear the user's borrowed books
        for (Book book : borrowedBooks) {
            book.setAvailable(true); // Mark each book as available
        }
        return borrowedBooks;
    }

    // Override toString method
    @Override
    public String toString() {
        return "User{" +
                "id=" + getId() +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                '}';
    }
}