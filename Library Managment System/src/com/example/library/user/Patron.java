package com.example.library.user;

import com.example.library.model.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Patron {
    private final String id, name;
    private final List <Book> borrowed = new ArrayList<>();

    public Patron(String id, String name) {
        this.id = id;
        this.name = name;
    }

    //when patron borrow book from library, book will add in their list
    public void Borrow(Book book){
        borrowed.add(book);
    }

    // book will remove from patron list, after returning book to library
    public void Return(Book book){
        borrowed.remove(book);
    }

    //patron have only read only access,Cant be modified list
    public List<Book> getBorrowed() {
        return Collections.unmodifiableList(borrowed);
    }

    @Override
    public String toString() {
        return name + "[" + id + "]";
    }
}
