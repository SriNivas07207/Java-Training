package Day7;

public class Employee {
    int id;
    String name;

    Employee(int i,String n) {
        id=i;
        name=n;
    }

    void display() {
        System.out.println(id+" "+name);
    }

    public static void main(String args[]) {

        Employee e1=
            new Employee(1,"John");

        Employee e2=
            new Employee(2,"Sam");

        e1.display();
        e2.display();
    }
}
