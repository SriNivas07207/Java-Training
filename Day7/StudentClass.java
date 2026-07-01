package Day7;

public class StudentClass {
    int id;
    String name;

    StudentClass(int i,String n) {
        id=i;
        name=n;
    }

    void display() {
        System.out.println(id+" "+name);
    }

    public static void main(String args[]) {

        StudentClass s1=new StudentClass(1,"John");
        StudentClass s2=new StudentClass(2,"Sam");
        StudentClass s3=new StudentClass(3,"David");

        s1.display();
        s2.display();
        s3.display();
    }
}
