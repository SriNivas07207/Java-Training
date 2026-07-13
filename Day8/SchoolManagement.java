package Day8;

class Person {

    String name = "Kumar";

    void display() {
        System.out.println(name);
    }
}

class Student extends Person {

    int roll = 101;

    void showStudent() {
        System.out.println(roll);
    }
}

class Teacher extends Person {

    String subject = "Java";

    void showTeacher() {
        System.out.println(subject);
    }
}

public class SchoolManagement {

    public static void main(String[] args) {

        Student s = new Student();
        s.display();
        s.showStudent();

        Teacher t = new Teacher();
        t.display();
        t.showTeacher();
    }
}
