package Day7;

public class EmployeeDemo {
     int id;
    String name;

    EmployeeDemo(int i,String n){
        id=i;
        name=n;
    }

    public static void main(String args[]){

        EmployeeDemo e1=
        new EmployeeDemo(101,"A");

        EmployeeDemo e2=
        new EmployeeDemo(102,"B");

        EmployeeDemo e3=
        new EmployeeDemo(103,"C");

        System.out.println(e1.name);
        System.out.println(e2.name);
        System.out.println(e3.name);
    }
}
