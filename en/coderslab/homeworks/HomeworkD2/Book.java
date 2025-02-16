//Exercise 3
//
//Modify the `Book` class:
//
//1. Add the private attribute `popularity` that will store the number of book loans, this number should increase by 1 with each loan.
//2. Define the `equals(Book book)` method which will return information whether the objects are equal based on the `id` attrib

package en.coderslab.homeworks.HomeworkD2;

class Book {
    private int id;                // Unique ID of the book
    private String title;          // Title of the book
    private boolean available;      // Availability status
    private int popularity;         // Number of loans

    // Constructor
    public Book(int id, String title) {
        this.id = id;
        this.title = title;
        this.available = true; // By default, a book is available
        this.popularity = 0;   // Initialize popularity to zero
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Loan the book
    public void loan() {
        if (available) {
            available = false;
            popularity++; // Increase popularity by 1
        }
    }

    // Equals method based on id
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book)) return false;
        Book book = (Book) obj;
        return id == book.id;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", available=" + available +
                ", popularity=" + popularity +
                '}';
    }
}