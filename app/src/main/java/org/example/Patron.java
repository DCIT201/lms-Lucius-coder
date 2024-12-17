package org.example;

public class Patron {
    private String name;

    public Patron(String name) {
        this.name = name;
    }

    // Simulate borrowing a book
    public void borrowBook(Book book) {
        if (book != null) {
            System.out.println(name + " borrowed \"" + book.getTitle() + "\" by " + book.getAuthor());
        } else {
            System.out.println(name + " cannot borrow a null book.");
        }
    }

    public String getName() {
        return name;
    }
}
