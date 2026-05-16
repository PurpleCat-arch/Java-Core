public class ThrowsKeywordDemo {
    public static void main(String[] args) {
        try {
            divide(10, 2);
            divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Handled in main: " + e.getMessage());
        }
    }

    // throws keyword declares that this method might throw an exception
    static void divide(int a, int b) throws ArithmeticException {
        int result = a / b;
        System.out.println(a + " / " + b + " = " + result);
    }
}
