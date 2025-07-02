package com.example.library.service;

import com.example.library.model.Book;
import com.example.library.strategy.SearchStrategy;
import java.util.*;
import java.util.stream.Collectors;


public class BookService {

    private final List<Book> books= new ArrayList<>();

    public void addBook(Book b){
        books.add(b);
        System.out.println("Added:"+b);
    }

    public boolean removeByIsbn(String isbn) {
        return books.removeIf(b -> b.getIsbn().equalsIgnoreCase(isbn));
    }

    public List<Book> search(String query, SearchStrategy strat) {
        return books.stream()
                .filter(b -> strat.match(b, query))
                .collect(Collectors.toList());
    }

    public Optional<Book> findByIsbn(String isbn) {
        return books.stream()
                .filter(b -> b.getIsbn().equalsIgnoreCase(isbn))
                .findFirst();
    }

    public List<Book> listAll() {
        return Collections.unmodifiableList(books);
    }
}
