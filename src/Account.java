public class Account {
    private int accNo;
    private String name;
    private double balance;

    Account(int accNo, String name, double balance) {
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

    
    public static void main(String[] args) {
        
    }
}
