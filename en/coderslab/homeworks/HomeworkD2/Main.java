// Created Main to test results of classes combined together

package en.coderslab.homeworks.HomeworkD2;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        // Create some books
        Book book1 = new Book(1, "1984");
        Book book2 = new Book(2, "Brave New World");

        // Create a sound book
        SoundBook soundBook = new SoundBook(3, "Sound of Music", 120, 2);

        // Create an author
        Author author = new Author(1, "George", "Orwell");

        // Create a user
        User user = new User(2, "Alice", "Smith");

        // User borrows a book
        user.borrowBook(book1);

        // User returns a book
        user.returnBook(book1);

        // User returns all books
        ArrayList<Book> returnedBooks = user.returnAllBooks();

        // Print results
        System.out.println(author);
        System.out.println(user);
        System.out.println(book1);
        System.out.println(soundBook);
        System.out.println("Returned books: " + returnedBooks);
    }
}
