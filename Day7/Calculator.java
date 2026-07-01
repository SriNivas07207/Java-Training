package Day7;

public class Calculator {

    int add(int a,int b) {
        return a+b;
    }

    static int multiply(int a,int b) {
        return a*b;
    }

    public static void main(String args[]) {

        Calculator c=new Calculator();

        System.out.println(c.add(5,10));

        System.out.println(
            Calculator.multiply(5,10)
        );
    }

}
    
