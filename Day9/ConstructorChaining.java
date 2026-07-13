package Day9;
class Student {

    Student() {
        this("Kumar");
        System.out.println("Default Constructor");
    }

    Student(String name) {
        System.out.println("Name : " + name);
    }
}

public class ConstructorChaining {

    public static void main(String[] args) {

        new Student();
    }
}
