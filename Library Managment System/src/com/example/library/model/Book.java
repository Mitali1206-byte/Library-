package com.example.library.model;

public class Book {
    private final String title,isbn, author;
    private boolean available = true;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }


    public String toString() {
        return "\"" + title + "\" by " + author + " (ISBN: " + isbn + ") — " +
                (available ? "Available" : "Borrowed");
    }
}
