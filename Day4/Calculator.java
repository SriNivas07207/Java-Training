package Day4;

public class Calculator {
     public static void main(String args[]) {

        int a=20;
        int b=10;
        int choice=3;

        switch(choice) {

            case 1:
                System.out.println(a+b);
                break;

            case 2:
                System.out.println(a-b);
                break;

            case 3:
                System.out.println(a*b);
                break;

            case 4:
                System.out.println(a/b);
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}
