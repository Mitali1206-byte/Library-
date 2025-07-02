package com.example.library.strategy;

import com.example.library.model.Book;

public class TitleSearch implements SearchStrategy {
    @Override
    public boolean match(Book book, String query) {
        return book.getTitle().toLowerCase().contains(query.toLowerCase());
    }
}
