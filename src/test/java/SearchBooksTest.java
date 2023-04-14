import com.library.models.Book;
import com.library.models.Library;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SearchBooksTest {

    @Test
    public void testSearchBooks() {
        Library library = new Library();
        Book book1 = new Book("The Hobbit", "J.R.R. Tolkien");
        Book book2 = new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling");
        Book book3 = new Book("The Lord of the Rings", "J.R.R. Tolkien");

        library.addBooks(book1);
        library.addBooks(book2);
        library.addBooks(book3);

        List<Book> searchByTitle = library.searchBooks("The Hobbit", null);
        assertEquals(1, searchByTitle.size());
        assertTrue(searchByTitle.contains(book1));

        List<Book> searchByAuthor = library.searchBooks(null, "J.R.R. Tolkien");
        assertEquals(2, searchByAuthor.size());
        assertTrue(searchByAuthor.contains(book1));
        assertTrue(searchByAuthor.contains(book3));

        List<Book> searchByTitleAndAuthor = library.searchBooks("The Lord of the Rings", "J.R.R. Tolkien");
        assertEquals(1, searchByTitleAndAuthor.size());
        assertTrue(searchByTitleAndAuthor.contains(book3));
    }
}
