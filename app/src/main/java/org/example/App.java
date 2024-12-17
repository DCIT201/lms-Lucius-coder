package org.example;

public class App {
      public static void main(String[] args) {
      Library library =new Library();
      library.addBook(new Book("CockCrow"));
      library.addBook(new Book("Aki-ola Mathematics"));
      library.addBook(new Book("harry potter"));
      Patron patron=new Patron("Lucius");
      System.out.println(patron.getName());

    }
}
