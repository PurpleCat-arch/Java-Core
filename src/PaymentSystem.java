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

public class PaymentSystem {
    public static void main(String[] args){

    }
}

