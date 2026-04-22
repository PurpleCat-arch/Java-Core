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

public class PaymentSystem {
    public static void main(String[] args){

    }
}

