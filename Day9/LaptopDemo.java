package Day9;
class Laptop {
    String brand;
    int price;

    Laptop(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    void display() {
        System.out.println("Brand : " + brand);
        System.out.println("Price : " + price);
    }
}

public class LaptopDemo {
    public static void main(String[] args) {

        Laptop l = new Laptop("Dell", 65000);
        l.display();
    }
}
