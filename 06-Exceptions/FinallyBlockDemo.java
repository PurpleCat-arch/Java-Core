public class FinallyBlockDemo {
    public static void main(String[] args) {
        System.out.println("Return value: " + testFinally());
    }

    static int testFinally() {
        try {
            System.out.println("Try block executing");
            return 1;
        } catch (Exception e) {
            System.out.println("Catch block executing");
            return 2;
        } finally {
            System.out.println("Finally block executes even before return!");
        }
    }
}
