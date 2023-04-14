import com.library.models.Author;
import com.library.models.Book;
import com.library.models.Library;
import com.library.models.Publisher;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LibraryTest {

    @Test
    public void testAddBook() {
        Library library = new Library();
        Author author = new Author("J.R.R. Tolkien", "British");
        Publisher publisher = new Publisher("Houghton Mifflin", "USA");
        Book book = new Book("Lord of The Rings", author, publisher);
        library.addBooks(book);

        assertEquals(1, library.getBooks().size());
        assertTrue(library.getBooks().contains(book));
    }

    @Test
    public void testSearchBooks() {
        Library library = new Library();
        Author author1 = new Author("J.R.R. Tolkien", "British");
        Author author2 = new Author("J.K. Rowling", "British");
        Publisher publisher = new Publisher("Houghton Mifflin", "USA");
        Book book1 = new Book("The Hobbit", author1, publisher);
        Book book2 = new Book("Harry Potter and the Philosopher's Stone", author2, publisher);
        Book book3 = new Book("The Lord of the Rings", author1, publisher);

        library.addBooks(book1);
        library.addBooks(book2);
        library.addBooks(book3);

        List<Book> searchByTitle = library.searchBooks("The Hobbit", null, null);
        assertEquals(1, searchByTitle.size());
        assertTrue(searchByTitle.contains(book1));

        List<Book> searchByAuthor = library.searchBooks(null, author1, null);
        assertEquals(2, searchByAuthor.size());
        assertTrue(searchByAuthor.contains(book1));
        assertTrue(searchByAuthor.contains(book3));

        List<Book> searchByTitleAndAuthor = library.searchBooks("The Lord of the Rings", author1, null);
        assertEquals(1, searchByTitleAndAuthor.size());
        assertTrue(searchByTitleAndAuthor.contains(book3));
    }

    @Test
    public void testRemoveBook() {
        Library library = new Library();
        Author author1 = new Author("J.R.R. Tolkien", "British");
        Author author2 = new Author("J.K. Rowling", "British");
        Publisher publisher = new Publisher("Houghton Mifflin", "USA");
        Book book1 = new Book("The Hobbit", author1, publisher);
        Book book2 = new Book("Harry Potter and the Philosopher's Stone", author2, publisher);

        library.addBooks(book1);
        library.addBooks(book2);

        library.removeBook("The Hobbit", author1, publisher);

        assertEquals(1, library.getBooks().size());
        assertFalse(library.getBooks().contains(book1));
        assertTrue(library.getBooks().contains(book2));
    }

}
