package Day9;
class Employee {

    String name;

    Employee(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(this.name);
    }
}

public class ShadowDemo {

    public static void main(String[] args) {

        Employee e = new Employee("Ravi");
        e.display();
    }
}
