package Day8;
class Furniture {
    Furniture() {
        System.out.println("Furniture Created");
    }
}

class Room {
    Furniture furniture = new Furniture();

    Room() {
        System.out.println("Room Created");
    }
}

class House {
    Room room = new Room();

    House() {
        System.out.println("House Created");
    }
}

public class CompositionDemo {
    public static void main(String[] args) {

        House h = new House();
    }
}