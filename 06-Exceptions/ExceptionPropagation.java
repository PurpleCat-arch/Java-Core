public class ExceptionPropagation {
    public static void main(String[] args) {
        try {
            methodA();
        } catch (ArithmeticException e) {
            System.out.println("Exception handled in main(): " + e.getMessage());
        }
        System.out.println("\n--- Call Stack Trace ---");
        try {
            methodA();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    static void methodA() {
        System.out.println("methodA() called");
        methodB();
    }

    static void methodB() {
        System.out.println("methodB() called");
        methodC();
    }

    static void methodC() {
        System.out.println("methodC() called - exception thrown here");
        int result = 10 / 0; // Exception propagates up: C -> B -> A -> main
    }
}
