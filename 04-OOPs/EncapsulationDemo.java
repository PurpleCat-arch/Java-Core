class BankAccount {
    private double balance; // Data hiding

    public BankAccount(double initialBalance) {
        if (initialBalance > 0) {
            this.balance = initialBalance;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }
    }

    public double getBalance() { // Read-only access to balance
        return balance;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100.0);
        account.deposit(50.0);
        // account.balance = 5000; // Not allowed, balance is private
        System.out.println("Current Balance: $" + account.getBalance());
    }
}
