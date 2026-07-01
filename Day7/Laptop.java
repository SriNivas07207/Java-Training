package Day7;

public class Laptop {
     String brand;

    Laptop() {
        System.out.println("Constructor called");
        brand="Dell";
    }

    public static void main(String args[]) {

        Laptop l=new Laptop();

        System.out.println(l.brand);
    }
}
