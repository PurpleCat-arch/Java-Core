import java.util.*;

/**
 * BankingSystem.java
 *
 * A console-based banking application that simulates core banking operations.
 * Demonstrates OOP (encapsulation, abstraction), Collections (HashMap),
 * Exception handling (custom exceptions, input validation), and menu-driven design.
 *
 * Features:
 *   - Create accounts with auto-generated IDs
 *   - Deposit and withdraw funds with validation
 *   - Check account balance
 *   - Transfer between accounts
 *   - View all accounts
 */
public class BankingSystem {

    // ─── Custom Exceptions ─────────────────────────────────────────
    static class InsufficientFundsException extends Exception {
        public InsufficientFundsException(String message) {
            super(message);
        }
    }

    static class AccountNotFoundException extends Exception {
        public AccountNotFoundException(String accountId) {
            super("Account not found: " + accountId);
        }
    }

    // ─── Account Model ─────────────────────────────────────────────
    static class Account {
        private final String accountId;
        private final String holderName;
        private double balance;

        public Account(String accountId, String holderName, double initialDeposit) {
            this.accountId = accountId;
            this.holderName = holderName;
            this.balance = initialDeposit;
        }

        public String getAccountId() { return accountId; }
        public String getHolderName() { return holderName; }
        public double getBalance() { return balance; }

        public void deposit(double amount) {
            if (amount <= 0) throw new IllegalArgumentException("Deposit amount must be positive.");
            balance += amount;
        }

        public void withdraw(double amount) throws InsufficientFundsException {
            if (amount <= 0) throw new IllegalArgumentException("Withdrawal amount must be positive.");
            if (amount > balance)
                throw new InsufficientFundsException(
                    String.format("Cannot withdraw ₹%.2f. Available balance: ₹%.2f", amount, balance));
            balance -= amount;
        }

        @Override
        public String toString() {
            return String.format("| %-10s | %-20s | ₹%,12.2f |", accountId, holderName, balance);
        }
    }

    // ─── Bank Service ───────────────────────────────────────────────
    static class Bank {
        private final Map<String, Account> accounts = new LinkedHashMap<>();
        private int nextId = 1001;

        public Account createAccount(String name, double initialDeposit) {
            String id = "ACC" + nextId++;
            Account account = new Account(id, name, initialDeposit);
            accounts.put(id, account);
            return account;
        }

        public Account getAccount(String id) throws AccountNotFoundException {
            Account account = accounts.get(id);
            if (account == null) throw new AccountNotFoundException(id);
            return account;
        }

        public void deposit(String id, double amount) throws AccountNotFoundException {
            getAccount(id).deposit(amount);
        }

        public void withdraw(String id, double amount)
                throws AccountNotFoundException, InsufficientFundsException {
            getAccount(id).withdraw(amount);
        }

        public void transfer(String fromId, String toId, double amount)
                throws AccountNotFoundException, InsufficientFundsException {
            Account from = getAccount(fromId);
            Account to = getAccount(toId);
            from.withdraw(amount);
            to.deposit(amount);
        }

        public void displayAllAccounts() {
            if (accounts.isEmpty()) {
                System.out.println("  No accounts exist yet.");
                return;
            }
            System.out.println("+" + "-".repeat(12) + "+" + "-".repeat(22) + "+" + "-".repeat(15) + "+");
            System.out.printf("| %-10s | %-20s | %-13s |%n", "ID", "Holder Name", "Balance");
            System.out.println("+" + "-".repeat(12) + "+" + "-".repeat(22) + "+" + "-".repeat(15) + "+");
            accounts.values().forEach(System.out::println);
            System.out.println("+" + "-".repeat(12) + "+" + "-".repeat(22) + "+" + "-".repeat(15) + "+");
        }
    }

    // ─── Main Application ───────────────────────────────────────────
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║      SIMPLE BANKING SYSTEM           ║");
        System.out.println("╚══════════════════════════════════════╝");

        boolean running = true;
        while (running) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Transfer");
            System.out.println("6. View All Accounts");
            System.out.println("0. Exit");
            System.out.print("Choice: ");

            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("⚠ Invalid input. Enter a number.");
                continue;
            }

            try {
                switch (choice) {
                    case 1 -> {
                        System.out.print("Holder Name: ");
                        String name = sc.nextLine().trim();
                        System.out.print("Initial Deposit: ");
                        double dep = Double.parseDouble(sc.nextLine().trim());
                        Account acc = bank.createAccount(name, dep);
                        System.out.printf("✔ Account created → %s%n", acc.getAccountId());
                    }
                    case 2 -> {
                        System.out.print("Account ID: ");
                        String id = sc.nextLine().trim();
                        System.out.print("Amount: ");
                        double amt = Double.parseDouble(sc.nextLine().trim());
                        bank.deposit(id, amt);
                        System.out.println("✔ Deposit successful.");
                    }
                    case 3 -> {
                        System.out.print("Account ID: ");
                        String id = sc.nextLine().trim();
                        System.out.print("Amount: ");
                        double amt = Double.parseDouble(sc.nextLine().trim());
                        bank.withdraw(id, amt);
                        System.out.println("✔ Withdrawal successful.");
                    }
                    case 4 -> {
                        System.out.print("Account ID: ");
                        String id = sc.nextLine().trim();
                        Account acc = bank.getAccount(id);
                        System.out.printf("Balance for %s (%s): ₹%,.2f%n",
                                acc.getAccountId(), acc.getHolderName(), acc.getBalance());
                    }
                    case 5 -> {
                        System.out.print("From Account: ");
                        String from = sc.nextLine().trim();
                        System.out.print("To Account: ");
                        String to = sc.nextLine().trim();
                        System.out.print("Amount: ");
                        double amt = Double.parseDouble(sc.nextLine().trim());
                        bank.transfer(from, to, amt);
                        System.out.println("✔ Transfer successful.");
                    }
                    case 6 -> bank.displayAllAccounts();
                    case 0 -> {
                        running = false;
                        System.out.println("Goodbye!");
                    }
                    default -> System.out.println("⚠ Invalid choice.");
                }
            } catch (AccountNotFoundException | InsufficientFundsException e) {
                System.out.println("✘ " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("⚠ " + e.getMessage());
            }
        }
        sc.close();
    }
}
