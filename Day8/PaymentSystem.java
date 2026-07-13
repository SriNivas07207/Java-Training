package Day8;
class Payment {
    void pay() {
        System.out.println("Payment Processing...");
    }
}

class UPI extends Payment {
    void pay() {
        System.out.println("Paid using UPI");
    }
}

class Card extends Payment {
    void pay() {
        System.out.println("Paid using Card");
    }
}

class Cash extends Payment {
    void pay() {
        System.out.println("Paid using Cash");
    }
}

public class PaymentSystem {
    public static void main(String[] args) {

        Payment p;

        p = new UPI();
        p.pay();

        p = new Card();
        p.pay();

        p = new Cash();
        p.pay();
    }
}