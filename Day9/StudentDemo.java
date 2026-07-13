package Day9;
class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
    }
}

public class StudentDemo {

    public static void main(String[] args) {

        Student s = new Student("Arun", 20);
        s.display();
    }
}
