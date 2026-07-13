package Day9;
class Employee {

    String name = "Arun";        // Instance Variable
    static String company = "TCS"; // Static Variable

    void display() {

        int salary = 50000;       // Local Variable

        System.out.println(name);
        System.out.println(company);
        System.out.println(salary);
    }
}

public class variableDemo {

    public static void main(String[] args) {

        Employee e = new Employee();
        e.display();
    }
}
