package Day3;
public class Problem11 {
    void add(int a,int b) {
        System.out.println(a+b);
    }

    void add(int a,int b,int c) {
        System.out.println(a+b+c);
    }

    public static void main(String args[]) {
        Problem11 obj=new Problem11();

        obj.add(5,10);
        obj.add(5,10,15);
    }
}
