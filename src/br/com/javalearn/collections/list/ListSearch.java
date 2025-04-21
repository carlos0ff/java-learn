package list;

import java.util.ArrayList;
import java.util.List;

import model.Book;
import model.CatalogBooks;

/**
 * A catalog that manages a collection of books with various search capabilities.
 * 
 * @author Your Name
 * @version 1.0.0-beta
 * @since 2025-04-21
 */
public class ListSearch {

  

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        CatalogBooks catalog = new CatalogBooks();
        catalog.addBook("1984", "George Orwell", 1949);
        catalog.addBook("Animal Farm", "George Orwell", 1945);

        // Search by author
        List<Book> orwellBooks = catalog.searchByAuthor("george orwell");

        // Search by year range
        List<Book> oldBooks = catalog.searchByYearRange(1940, 1950);

        // Search by title
        Book foundBook = catalog.searchByTitle("1984");
    }
}
