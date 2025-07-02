package com.example.library;

import com.example.library.model.Book;
import com.example.library.service.BookService;
import com.example.library.service.LendingService;
import com.example.library.strategy.AuthorSearch;
import com.example.library.user.Patron;

public class Main {
    public static void main(String[] args) {
        BookService bookSvc = new BookService();
        LendingService lendSvc = new LendingService();

        Patron lishi = new Patron("P001", "Lishi");
        Patron bittu   = new Patron("P002", "Bittu");

        bookSvc.addBook(new Book("Clean Code", "Robert Martin", "9780132350884"));
        bookSvc.addBook(new Book("Effective Java", "Joshua Bloch", "9780134685991"));

        System.out.println("\nAll books:");
        bookSvc.listAll().forEach(System.out::println);

        System.out.println("\nSearch by author 'Bloch':");
        bookSvc.search("Bloch", new AuthorSearch())
                .forEach(System.out::println);

        bookSvc.findByIsbn("9780132350884").ifPresent(b -> lendSvc.checkout(b, lishi));
        bookSvc.findByIsbn("9780134685991").ifPresent(b -> lendSvc.checkin(b, bittu));

        System.out.println("\nLishi’s borrowed books: " + lishi.getBorrowed());
    }
}
