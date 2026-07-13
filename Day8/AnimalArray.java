package Day8;

class Animal {
    void sound() {
        System.out.println("Animal");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog Barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat Meows");
    }
}

public class AnimalArray {
    public static void main(String[] args) {

        Animal[] animals = {
                new Dog(),
                new Cat(),
                new Animal()
        };

        for (Animal a : animals) {
            a.sound();
        }
    }
}