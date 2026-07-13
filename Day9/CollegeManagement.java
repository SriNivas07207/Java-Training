package Day9;

class Person {

    String name = "Rahul";

    void displayName() {
        System.out.println(name);
    }
}

class Student extends Person {

    int rollNo = 101;

    void displayStudent() {
        System.out.println("Roll No : " + rollNo);
    }
}

class Teacher extends Person {

    String subject = "Java";

    void displayTeacher() {
        System.out.println("Subject : " + subject);
    }
}

public class CollegeManagement {

    public static void main(String[] args) {

        Student s = new Student();
        Teacher t = new Teacher();

        s.displayName();
        s.displayStudent();

        t.displayName();
        t.displayTeacher();
    }
}
