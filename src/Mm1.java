abstract class ATM {
    abstract void withdraw(double amount);
    abstract void checkBalance();
}

class SBIATM extends ATM {
    void withdraw(double amount) {
        System.out.println("Withdrawn: " + amount);
    }

    void checkBalance() {
        System.out.println("Balance is 5000");
    }
}
public class Mm1 {
    public static void main(String[] args) {
        ATM atm = new SBIATM();
        atm.withdraw(1000);
        atm.checkBalance();
    }   
}
