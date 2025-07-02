package com.example.library.strategy;

import com.example.library.model.Book;

public class ISBN implements SearchStrategy{
    @Override
    public boolean match(Book book, String query) {
        return book.getIsbn()
                .equalsIgnoreCase(query);
    }
}
