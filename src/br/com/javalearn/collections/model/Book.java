package model;

/**
 * Represents a book with title, author, and publication year.
 * This class provides methods to access and modify book information.
 * 
 * @author Your Name
 * @version 1.0
 * @since 2023-11-20
 */
public class Book {
    /** The title of the book */
    private String title;

    /** The author of the book */
    private String author;

    /** The publication year of the book */
    private int yearPublication;

    /**
     * Constructs a new Book with the specified details.
     * @param title The title of the book
     * @param author The author of the book
     * @param yearPublication The publication year of the book
     */
    public Book(String title, String author, int yearPublication) {
        this.title = title;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    /**
     * Gets the title of the book.
     * @return The title of the book
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the author of the book.
     * @return The author of the book
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the author of the book.
     * @param author The new author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Gets the publication year of the book.
     * @return The publication year
     */
    public int getYearPublication() {
        return yearPublication;
    }

    /**
     * Sets the publication year of the book.
     * @param yearPublication The new publication year to set
     */
    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    /**
     * Returns a string representation of the book.
     * @return A string containing book details
     */
    @Override
    public String toString() {
        return """
            Book {
                title=%s,
                author=%s,
                yearPublication=%d
            }""".formatted(title, author, yearPublication);
    }
}