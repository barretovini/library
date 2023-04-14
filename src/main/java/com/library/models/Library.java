package com.library.models;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBooks(Book book) {
        this.books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }
}
