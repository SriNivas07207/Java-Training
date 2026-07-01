package Day7;

public class Person {
     void display() {
        System.out.println("Person class");
    }
}

class Student extends Person {

    void display() {
        System.out.println("Student class");
    }

    public static void main(String args[]) {

        Person p = new Student();

        p.display();
    }
}
