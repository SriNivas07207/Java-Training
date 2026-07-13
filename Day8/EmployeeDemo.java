package Day8;
class Employee {

    void work() {
        System.out.println("Employee Working");
    }
}

class Developer extends Employee {

    void work() {
        System.out.println("Developer Writing Code");
    }
}

class Tester extends Employee {

    void work() {
        System.out.println("Tester Testing Software");
    }
}

public class EmployeeDemo {

    public static void main(String[] args) {

        Employee[] emp = {
                new Developer(),
                new Tester()
        };

        for (Employee e : emp) {
            e.work();
        }
    }
}