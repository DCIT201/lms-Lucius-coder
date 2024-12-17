package org.example;

public class App {
    public static void main(String[] args) {
        // Initialize the library
        Library library = new Library();

        // Create books
        Book book1 = new Book("1984", "George Orwell", 1949);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Display books in the library
        library.displayBooks();

        // Create a patron
        Patron patron = new Patron("Alice");

        // Patron borrows a book
        patron.borrowBook(book1);
    }
}
