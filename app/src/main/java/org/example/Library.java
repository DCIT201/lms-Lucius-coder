package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added book: " + book.getTitle());
        }

    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.isAvailable()) {
                book.borrow();
                System.out.println(title + " has been borrowed.");
                return;
            }
        }
        System.out.println(title + " is not available.");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && !book.isAvailable()) {
                book.returnBook();
                System.out.println(title + " has been returned.");
                return;
            }
        }
        System.out.println(title + " was not borrowed.");
    }

    public void displayBooks() {
        for (Book book : books) {
            String status = book.isAvailable() ? "Available" : "Borrowed";
            System.out.println(book.getTitle() + " - " + status);
        }
    }
}
