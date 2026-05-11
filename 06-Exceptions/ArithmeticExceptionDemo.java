public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        int[] divisors = {5, 0, 3, 0, 2};
        int dividend = 100;

        for (int i = 0; i < divisors.length; i++) {
            try {
                int result = dividend / divisors[i];
                System.out.println(dividend + " / " + divisors[i] + " = " + result);
            } catch (ArithmeticException e) {
                System.out.println(dividend + " / " + divisors[i] + " => Error: " + e.getMessage());
            }
        }
    }
}
