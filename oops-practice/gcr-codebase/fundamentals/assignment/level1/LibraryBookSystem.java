class Book {
    String title;
    String author;
    double price;
    boolean available;

    Book(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " borrowed successfully.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Available: " + available);
    }
}

public class LibraryBookSystem {
    public static void main(String[] args) {
        Book b = new Book("DSA", "Mark Allen", 450, true);

        b.display();
        b.borrowBook();
        b.display();
    }
}