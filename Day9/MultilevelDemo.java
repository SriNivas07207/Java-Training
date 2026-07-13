package Day9;
class Person {

    void person() {
        System.out.println("Person");
    }
}

class Employee extends Person {

    void employee() {
        System.out.println("Employee");
    }
}

class Manager extends Employee {

    void manager() {
        System.out.println("Manager");
    }
}

public class MultilevelDemo {

    public static void main(String[] args) {

        Manager m = new Manager();

        m.person();
        m.employee();
        m.manager();
    }
}