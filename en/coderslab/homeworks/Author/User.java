//Exercise 3
//
//Create a `User` class that will meet the following requirements:
//1. It should have private attributes:
//* `id` - this attribute holds the ID,
//* `firstName` - an attribute that specifies the user's name,
//* `lastName` - an attribute that specifies the user's last name,
//* `books` - an array of `Book` class objects.
//
//2. Add the `addBook(Book book)` method, which will add a new book to the book array of the user.
//3. Implement the ability to dynamically resize the array.

package en.coderslab.homeworks.Author;

public class User {
    private int id;                           // Holds the user ID
    private String firstName;                 // User's first name
    private String lastName;                  // User's last name
    private Book[] books;                     // Array of Book objects
    private int bookCount;                    // Current number of books

    // Constructor
    public User(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.books = new Book[5];              // Initial capacity of 5
        this.bookCount = 0;                    // Start with 0 books
    }

    // Method to add a book to the user's book array
    public void addBook(Book book) {
        // Check if the book array is full
        if (bookCount >= books.length) {
            resizeArray();                     // Resize the array if needed
        }
        books[bookCount] = book;                // Add the new book
        bookCount++;                            // Increment the count of books
    }

    // Method to resize the array
    private void resizeArray() {
        Book[] newBooksArray = new Book[books.length * 2]; // Double the size
        System.arraycopy(books, 0, newBooksArray, 0, books.length); // Copy old array to new
        books = newBooksArray;                 // Reference the new array
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Book[] getBooks() {
        return books;
    }

    public int getBookCount() {
        return bookCount;
    }

    // toString method for easy printing
    @Override
    public String toString() {
        StringBuilder booksList = new StringBuilder();
        for (int i = 0; i < bookCount; i++) {
            booksList.append(books[i].getTitle()).append(" (ID: ").append(books[i].getId()).append("), ");
        }
        // Remove the trailing comma and space if any
        if (booksList.length() > 0) {
            booksList.setLength(booksList.length() - 2);
        }

        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", books=[" + booksList.toString() +
                "]" +
                '}';
    }
}