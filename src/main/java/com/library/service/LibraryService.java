package com.library.service;

import com.library.model.Author;
import com.library.model.Book;
import com.library.model.Library;
import com.library.model.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LibraryService {

    private Library library;

    @Autowired
    public LibraryService(Library library) {
        this.library = library;
    }


    public void addBooks(Book book) {
        this.library.getBooks().add(book);
    }

    public List<Book> searchBooks(String title, Author author, Publisher publisher) {
        return library.getBooks().stream()
                .filter(book -> (title == null || book.getTitle().equals(title)) &&
                                (author == null || book.getAuthor().equals(author)) &&
                                (publisher == null || book.getPublisher().equals(publisher)))
                .collect(Collectors.toList());
    }

    public void removeBook(String title, Author author, Publisher publisher) {
        library.getBooks().removeIf(book -> book.getTitle().equals(title) &&
                                    book.getAuthor().equals(author) &&
                                    book.getPublisher().equals(publisher));
    }

}

