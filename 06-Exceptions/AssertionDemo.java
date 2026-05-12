public class AssertionDemo {
    public static void main(String[] args) {
        System.out.println("Note: Run with 'java -ea AssertionDemo' to enable assertions.\n");

        int age = 25;
        assert age >= 0 : "Age cannot be negative!";
        System.out.println("Age is valid: " + age);

        double balance = 1000.0;
        balance -= 500;
        assert balance >= 0 : "Balance went negative: " + balance;
        System.out.println("Balance after withdrawal: " + balance);

        // This assertion would fail if assertions are enabled
        try {
            int negativeAge = -5;
            assert negativeAge >= 0 : "Age cannot be negative! Got: " + negativeAge;
            System.out.println("If assertions disabled, this line runs for age: " + negativeAge);
        } catch (AssertionError e) {
            System.out.println("AssertionError caught: " + e.getMessage());
        }
    }
}
