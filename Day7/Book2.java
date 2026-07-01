package Day7;

public class Book2 {
    String bookName="Java";

    void show() {
        System.out.println(bookName);
    }
}

class Library {

    public static void main(String args[]) {

        Book b1=new Book();
        Book b2=new Book();

        b1.show();
        b2.show();
    }
}
