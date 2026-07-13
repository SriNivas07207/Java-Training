package Day8;
class Food {
    void prepare() {
        System.out.println("Preparing Food");
    }
}

class Pizza extends Food {
    void prepare() {
        System.out.println("Pizza Prepared");
    }
}

class Burger extends Food {
    void prepare() {
        System.out.println("Burger Prepared");
    }
}

class Customer {
    void order(Food food) {
        food.prepare();
    }
}

public class FoodDelivery {
    public static void main(String[] args) {

        Customer c = new Customer();

        c.order(new Pizza());
        c.order(new Burger());
    }
}