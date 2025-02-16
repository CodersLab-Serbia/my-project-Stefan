//Exercise 2
//
//Create a `SoundBook` class that meets the following requirements:
//1. It should have private attributes:
//* `duration` - this attribute should store the length of recordings,
//* `numberOfCarriers` - an attribute that specifies the number of media (CDs, cassettes) that are contained within a single book.
//
//2. Define the appropriate inheritance between the `SoundBook` class and the `Book` class.

package en.coderslab.homeworks.HomeworkD2;


public class SoundBook extends Book {
    private int duration;          // Duration of recordings
    private int numberOfCarriers;  // Number of media (CDs, cassettes)

    // Constructor
    public SoundBook(int id, String title, int duration, int numberOfCarriers) {
        super(id, title); // Call to Book constructor
        this.duration = duration;
        this.numberOfCarriers = numberOfCarriers;
    }

    // Getters
    public int getDuration() {
        return duration;
    }

    public int getNumberOfCarriers() {
        return numberOfCarriers;
    }

    // Override toString method
    @Override
    public String toString() {
        return "SoundBook{" +
                "id=" + getId() +
                ", title='" + getTitle() + '\'' +
                ", duration=" + duration +
                ", numberOfCarriers=" + numberOfCarriers +
                '}';
    }
}