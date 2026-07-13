package Day8;
class Vehicle {
    void start() {
        System.out.println("Vehicle Starts");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car Starts");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike Starts");
    }
}

public class VehicleArray {
    public static void main(String[] args) {

        Vehicle[] vehicles = {
                new Car(),
                new Bike(),
                new Vehicle()
        };

        for (Vehicle v : vehicles) {
            v.start();
        }
    }
}
