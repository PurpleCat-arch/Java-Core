import java.util.Scanner;

class Account1 {
    private int accNo;
    private String name;
    private double balance;

    Account1(int accNo, String name, double balance) {
    this.accNo = accNo;
    this.name = name;
    this.balance = balance;
    }

    int getAccNo() {
        return accNo;
    }

    String getName() {
        return name;
    }

    double getBalance() {
        return balance;
    }

    void deposit(double amount) {
    if (amount > 0) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    } else {
        System.out.println("Invalid amount!");
    }
    }

    void withdraw(double amount) {
    if (amount <= 0) {
        System.out.println("Invalid amount!");
    } else if (amount > balance) {
        System.out.println("Insufficient balance!");
    } else {
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }
    }

    String history = "";

    void addTransaction(String record) {
        history += record + "\n";
    }

    void showHistory() {
        System.out.println("Transaction History:");
        System.out.println(history);
    }

    void display() {
    System.out.println("Account No: " + accNo);
    System.out.println("Name: " + name);
    System.out.println("Balance: " + balance);
    }
}
public  class Account{
    static Account1[] accounts = new Account1[100];
    static int count = 0;

    static void createAccount(Scanner sc) {
    System.out.print("Enter Account No: ");
    int accNo = sc.nextInt();
    sc.nextLine();

    System.out.print("Enter Name: ");
    String name = sc.nextLine();

    System.out.print("Enter Initial Balance: ");
    double balance = sc.nextDouble();

    if (balance < 0) {
        System.out.println("Invalid balance!");
        return;
    }

    accounts[count++] = new Account1(accNo, name, balance);
    System.out.println("Account Created!");
    }

    static Account1 findAccount(int accNo) {
    for (int i = 0; i < count; i++) {
        if (accounts[i].getAccNo() == accNo) {
            return accounts[i];
        }
    }
    return null;
    }

    static void depositMoney(Scanner sc) {
    System.out.print("Enter Account No: ");
    int accNo = sc.nextInt();

    Account1 acc = findAccount(accNo);
    if (acc != null) {
        System.out.print("Enter amount: ");
        double amt = sc.nextDouble();
        acc.deposit(amt);
        acc.addTransaction("Deposited: " + amt);
    } else {
        System.out.println("Account not found!");
    }
    }

    static void withdrawMoney(Scanner sc) {
            System.out.print("Enter Account No: ");
    int accNo = sc.nextInt();

    Account1 acc = findAccount(accNo);
    if (acc != null) {
        System.out.print("Enter amount: ");
        double amt = sc.nextDouble();
        acc.withdraw(amt);
        acc.addTransaction("Withdrawn: " + amt);
    } else {
        System.out.println("Account not found!");
    }
    }

    static void checkBalance(Scanner sc) {
    System.out.print("Enter Account No: ");
    int accNo = sc.nextInt();

    Account1 acc = findAccount(accNo);
    if (acc != null) {
        System.out.println("Balance: " + acc.getBalance());
        acc.showHistory();
    } else {
        System.out.println("Account not found!");
    }
    }
    
    public static void main(String[] args) {
        
    }
}
