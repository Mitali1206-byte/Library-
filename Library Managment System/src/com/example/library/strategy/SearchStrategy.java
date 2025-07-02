package com.example.library.strategy;

import com.example.library.model.Book;

public interface SearchStrategy {
    boolean match(Book book, String query);
}
