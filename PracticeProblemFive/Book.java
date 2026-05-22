package SemsterFinal;
public class Book {

    private String title;
    private String author;

    public Book(String title) {
        this.title = title;
        this.author = "Unknown";
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("------------------");
    }

    public static void main(String[] args) {

        Book b1 = new Book("Harry Potter");
        Book b2 = new Book("Atomic Habits", "James Clear");

        b1.display();
        b2.display();
    }
}
