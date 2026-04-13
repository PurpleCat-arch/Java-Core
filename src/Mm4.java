abstract class Payment {
    abstract void pay(double amount);
}

class UPI extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

class CardPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Card");
    }
}
public class Mm4 {
    public static void main(String[] args) {
        Payment payment1 = new UPI();
        payment1.pay(100.0);

        Payment payment2 = new CardPayment();
        payment2.pay(200.0);   
    }
}
