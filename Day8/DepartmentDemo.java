package Day8;
class Teacher {

    String name;

    Teacher(String name) {
        this.name = name;
    }
}

class Department {

    String deptName;
    Teacher teacher;

    Department(String deptName, Teacher teacher) {
        this.deptName = deptName;
        this.teacher = teacher;
    }

    void display() {
        System.out.println(deptName);
        System.out.println(teacher.name);
    }
}

public class DepartmentDemo {

    public static void main(String[] args) {

        Teacher t = new Teacher("Arun");

        Department d = new Department("CSE", t);

        d.display();
    }
}