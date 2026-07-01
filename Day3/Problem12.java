package Day3;
public class Problem12 {
    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Problem12 {

    public static void main(String args[]) {
        Dog d=new Dog();
        d.sound();
    }
}
