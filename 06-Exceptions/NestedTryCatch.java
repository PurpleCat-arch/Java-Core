public class NestedTryCatch {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try block");
            int[] arr = {1, 2, 3};

            try {
                System.out.println("Inner try block 1");
                System.out.println("Element: " + arr[5]); // Will throw
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: " + e.getMessage());
            }

            try {
                System.out.println("Inner try block 2");
                int result = 10 / 0; // Will throw
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: " + e.getMessage());
            }

            System.out.println("Outer try continues...");

        } catch (Exception e) {
            System.out.println("Outer catch: " + e.getMessage());
        } finally {
            System.out.println("Outer finally block executed.");
        }
    }
}
