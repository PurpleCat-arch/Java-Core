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

    
    public static void main(String[] args) {
        
    }
}
