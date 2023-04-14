import com.library.models.Book;
import com.library.models.Library;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddBookTest {
    @Test
    public void testAdicionarLivro() {
        Library library = new Library();
        Book book = new Book("Lord of The Rings", "J.R.R. Tolkien");
        library.addBooks(book);

        assertEquals(1, library.getBooks().size());
        assertTrue(library.getBooks().contains(book));
    }
}
