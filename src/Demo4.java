class Bank {
    int getRate() {
        return 5;
    }
}

class SBI extends Bank {
    @Override
    int getRate() {
        return 7; // different logic
    }
}
public class Demo4 {
    public static void main(String[] args) {
        Bank b = new Bank();
        SBI s = new SBI();

        System.out.println(b.getRate());
        System.out.println(s.getRate());
    }

}
