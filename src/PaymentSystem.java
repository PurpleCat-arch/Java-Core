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

class Wallet implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Wallet");
    }
}


public class PaymentSystem {
    static User[] users = new User[50];
    static int count=0;

    static void addUser(java.util.Scanner sc) {
    System.out.print("Enter Account No: ");
    int accNo = sc.nextInt();
    sc.nextLine();

    System.out.print("Enter Name: ");
    String name = sc.nextLine();

    if (name.isEmpty()) {
        System.out.println("Invalid name!");
        return;
    }

    users[count++] = new User(accNo, name);
    System.out.println("User added!");
    }

    

    public static void main(String[] args){

    }
}

