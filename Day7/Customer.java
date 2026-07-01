package Day7;

public class Customer {
    String name="John";
}

class Product {
    String productName="Laptop";
}

class Order {

    public static void main(String args[]) {

        Customer c=new Customer();
        Product p=new Product();

        System.out.println(c.name);
        System.out.println(p.productName);
    }

}
