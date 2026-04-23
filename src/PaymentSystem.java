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

    @SuppressWarnings("unused")
    abstract void display();

    public String getName() {
        return name;
    }
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
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

class UPI implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

class Wallet implements Payment {
    @Override
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
        case 1 -> p = new CreditCard();
        case 2 -> p = new UPI();
        case 3 -> p = new Wallet();
        default -> {
            System.out.println("Invalid choice!");
            return;
            }
    }

    p.pay(amt); // POLYMORPHISM
    }

    static void displayUsers() {
    for (int i = 0; i < count; i++) {
        users[i].display();
    }
    }


    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);

    while (true) {
        System.out.println("\n1.Add User 2.Make Payment 3.Show Users 4.Exit");
        int ch = sc.nextInt();

        switch (ch) {
            case 1 -> addUser(sc);
            case 2 -> makePayment(sc);
            case 3 -> displayUsers();
            case 4 -> {
                return;
                }
            default -> System.out.println("Invalid choice!");
        }
        }
    }
}

