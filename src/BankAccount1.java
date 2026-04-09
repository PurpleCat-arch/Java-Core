public class BankAccount1 {
     private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient balance");
    }

    public void display() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount1 acc = new BankAccount1();
        acc.deposit(1000);
        acc.withdraw(500);
        acc.display();
    }
}
