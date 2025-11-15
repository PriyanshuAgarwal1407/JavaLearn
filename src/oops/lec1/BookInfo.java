package oops.lec1;

class Book {
    String title;
    String author;
    int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }
}


public class BookInfo {
    public static void main(String[] args) {
        // Class Instantiation
        Book book1 = new Book("1984", "George Orwell", 328);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 281);

        book1.displayInfo();
        System.out.println();
        book2.displayInfo();
    }
}

