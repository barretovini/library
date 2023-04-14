package com.library.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBooks(Book book) {
        this.books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Book> searchBooks(String title, Author author, Publisher publisher) {
        return books.stream()
                .filter(book -> (title == null || book.getTitle().equals(title)) &&
                        (author == null || book.getAuthor().equals(author)) &&
                        (publisher == null || book.getPublisher().equals(publisher)))
                .collect(Collectors.toList());
    }

    public void removeBook(String title, Author author, Publisher publisher) {
        books.removeIf(book -> book.getTitle().equals(title) &&
                book.getAuthor().equals(author) &&
                book.getPublisher().equals(publisher));
    }
}
