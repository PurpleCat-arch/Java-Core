public class StaticMethods {
    static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        // Calling static method directly using class name without creating an object
        int result = StaticMethods.multiply(5, 4);
        System.out.println("Result of multiplication: " + result);
    }
}
