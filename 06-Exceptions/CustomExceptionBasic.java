class InsufficientFundsException extends Exception {
    private double amount;

    InsufficientFundsException(double amount) {
        super("Insufficient funds. Shortfall: Rs." + amount);
        this.amount = amount;
    }

    double getShortfall() {
        return amount;
    }
}

public class CustomExceptionBasic {
    private double balance;

    CustomExceptionBasic(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(amount - balance);
        }
        balance -= amount;
        System.out.println("Withdrawn: Rs." + amount + " | Balance: Rs." + balance);
    }

    public static void main(String[] args) {
        CustomExceptionBasic account = new CustomExceptionBasic(1000);

        try {
            account.withdraw(400);
            account.withdraw(800);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Shortfall amount: Rs." + e.getShortfall());
        }
    }
}
