package com.example.library.strategy;

import com.example.library.model.Book;

public class AuthorSearch implements SearchStrategy{
    @Override
    public boolean match(Book book, String query) {
        return book.getAuthor()
                .toLowerCase()
                .contains(query.toLowerCase());;
    }
}
