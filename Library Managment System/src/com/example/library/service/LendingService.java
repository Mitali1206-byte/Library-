package com.example.library.service;

import com.example.library.model.Book;
import com.example.library.user.Patron;

public class LendingService {

    public boolean checkout(Book b, Patron p) {
        if (b.isAvailable()) {
            b.setAvailable(false);
            p.Borrow(b);
            System.out.println(p + " checked out \"" + b.getTitle() + "\"");
            return true;
        }
        System.out.println("Cannot checkout — \"" + b.getTitle() + "\" isn’t available.");
        return false;
    }

    public boolean checkin(Book b, Patron p) {
        if (!b.isAvailable()) {
            b.setAvailable(true);
            p.Return(b);
            System.out.println(p + " returned \"" + b.getTitle() + "\"");
            return true;
        }
        System.out.println("Cannot return — \"" + b.getTitle() + "\" wasn’t borrowed.");
        return false;
    }
}
