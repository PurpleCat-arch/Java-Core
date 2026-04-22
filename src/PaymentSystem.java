interface Payment {
    void pay(double amount);
}

abstract class Account {
    int accNo;
    String name;

    Account (int accNo,String name){
        this.accNo=accNo;
        this.name=name;
    }

    abstract void display();
}

class User extends Account {
    User(int accNo, String name){
        super(accNo,name);
    }

    @Override
    void display() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}

class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

class UPI implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

public class PaymentSystem {
    public static void main(String[] args){

    }
}

