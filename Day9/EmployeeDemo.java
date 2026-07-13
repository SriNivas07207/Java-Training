package Day9;
class Person {

    void showPerson() {
        System.out.println("Person Details");
    }
}

class Employee extends Person {

    void showEmployee() {
        System.out.println("Employee Details");
    }
}

public class EmployeeDemo {

    public static void main(String[] args) {

        Employee e = new Employee();

        e.showPerson();
        e.showEmployee();
    }
}
