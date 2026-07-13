package Day9;
class BankAccount {

    String name;
    double balance;

    BankAccount() {
        this("Unknown", 0);
    }

    BankAccount(String name) {
        this(name, 1000);
    }

    BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void display() {
        System.out.println(name);
        System.out.println(balance);
    }
}

public class BankDemo {

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount("Arun");
        BankAccount b3 = new BankAccount("Kumar", 5000);

        b1.display();
        b2.display();
        b3.display();
    }
}
