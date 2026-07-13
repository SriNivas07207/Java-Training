package Day9;
class Book {

    String title;
    double price;

    Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    void display() {
        System.out.println(title);
        System.out.println(price);
    }
}

public class BookStore {

    public static void main(String[] args) {

        Book b1 = new Book("Java", 500);
        Book b2 = new Book("Python", 450);

        b1.display();
        b2.display();
    }
}