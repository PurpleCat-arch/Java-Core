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

    static User findUser(int accNo) {
    for (int i = 0; i < count; i++) {
        if (users[i].accNo == accNo) {
            return users[i];
        }
    }
    return null;
    }

    static void makePayment(java.util.Scanner sc) {
    System.out.print("Enter Account No: ");
    int accNo = sc.nextInt();

    User user = findUser(accNo);
    if (user == null) {
        System.out.println("User not found!");
        return;
    }

    System.out.print("Enter Amount: ");
    double amt = sc.nextDouble();

    if (amt <= 0) {
        System.out.println("Invalid amount!");
        return;
    }

    System.out.println("1.CreditCard 2.UPI 3.Wallet");
    int choice = sc.nextInt();

    Payment p;

    switch (choice) {
        case 1: p = new CreditCard(); break;
        case 2: p = new UPI(); break;
        case 3: p = new Wallet(); break;
        default:
            System.out.println("Invalid choice!");
            return;
    }

    p.pay(amt); // POLYMORPHISM
    }

    static void displayUsers() {
    for (int i = 0; i < count; i++) {
        users[i].display();
    }
    }


    public static void main(String[] args){

    }
}

