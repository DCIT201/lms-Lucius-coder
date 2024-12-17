package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        if (book != null) {
            books.add(book);
            System.out.println("Book added: " + book.getTitle());
        }
    }

    // Display all books in the library
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("The library is empty.");
        } else {
            System.out.println("Books in the library:");
            for (Book book : books) {
                System.out.println(book.getTitle() + " by " + book.getAuthor() + " (" + book.getYearPublished() + ")");
            }
        }
    }
}
