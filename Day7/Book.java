package Day7;

public class Book {
    String name;

    Book() {
        name="Java Programming";
    }

    public static void main(String args[]) {

        Book b=new Book();

        System.out.println(b.name);
    }

    public void show() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'show'");
    }
}
