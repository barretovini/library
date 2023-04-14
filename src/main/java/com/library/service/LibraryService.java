package com.library.service;

import com.library.models.Author;
import com.library.models.Book;
import com.library.models.Library;
import com.library.models.Publisher;

import java.util.List;
import java.util.stream.Collectors;


public class LibraryService {

    private Library library;

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

