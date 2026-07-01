package Day7;
class BankAccount {

    double balance = 1000;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Balance after deposit: " + balance);
    }

    void withdraw(double amount) {

        if(amount <= balance) {
            balance -= amount;
            System.out.println("Balance after withdrawal: " + balance);
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }

    public static void main(String args[]) {

        BankAccount b = new BankAccount();

        b.deposit(500);
        b.withdraw(300);
    }
}
