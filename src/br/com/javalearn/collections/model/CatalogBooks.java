package model;

import java.util.ArrayList;
import java.util.List;

/**
 * A catalog system for managing and searching books.
 * Provides functionality to add books and search them by various criteria.
 * 
 * @author Your Name
 * @version 1.0
 * @since 2025-04-21
 */
public class CatalogBooks {
    
    /** The list of books in the catalog **/
    private List<Book> bookList;

    /** Constructs an empty book catalog. **/
    public CatalogBooks() {
        this.bookList = new ArrayList<>();
    }

    /**
    * Adds a new book to the catalog.
    * @param title The title of the book
    * @param author The author of the book
    * @param yearPublication The publication year of the book
    */
    public void addBook(String title, String author, int yearPublication)
    {
        bookList.add(new Book(title, author, yearPublication));
    }

    /**
    * Searches for books by a specific author (case insensitive).
    * @param author The author to search for
    * @return List of books by the specified author
    * @throws RuntimeException if the book list is empty
    */
   public List<Book> searchToAuthor(String author) 
   {

    List<Book> booksByAuthor = new ArrayList<>();

    if (!bookList.isEmpty()) {
        for (Book book : bookList) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    } else {
        throw new RuntimeException("The list is empty");
    }

   }

   /**
     * Searches for books published within a specific year range (inclusive).
     * @param yearStart The starting year of the range (inclusive)
     * @param yearEnd The ending year of the range (inclusive)
     * @return List of books published in the specified range
     * @throws IllegalArgumentException if yearStart > yearEnd
     * @throws RuntimeException if the book list is empty
     */
    public List<Book> searchByYearRange(int yearStart, int yearEnd) {
        if (yearStart > yearEnd) {
            throw new IllegalArgumentException("Starting year cannot be greater than ending year");
        }

        if (bookList.isEmpty()) {
            throw new RuntimeException("The book list is empty");
        }

        List<Book> booksInRange = new ArrayList<>();

        for (Book book : bookList) {
            int publicationYear = book.getYearPublication();
            
            if (publicationYear >= yearStart && publicationYear <= yearEnd) {
                booksInRange.add(book);
            }
        }

        return booksInRange;
    }

    /**
     * Searches for a book by its exact title (case insensitive).
     * @param title The title to search for
     * @return The first book found with the matching title, or null if not found
     */
    public Book searchByTitle(String title) {

        if (!bookList.isEmpty()) {
            for (Book book : bookList) {
                if (book.getTitle().equalsIgnoreCase(title)) {
                    return book;
                }
            }
        }

        return null;
    }

    /**
     * Gets the number of books in the catalog.
     * @return the total number of books
     */
    public int getBookCount() {
        return bookList.size();
    }
}
