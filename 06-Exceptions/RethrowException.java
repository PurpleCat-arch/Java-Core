public class RethrowException {
    public static void main(String[] args) {
        try {
            processData(-5);
        } catch (Exception e) {
            System.out.println("Final handler in main: " + e.getMessage());
        }
    }

    static void processData(int value) throws Exception {
        try {
            validateData(value);
        } catch (IllegalArgumentException e) {
            System.out.println("Logging in processData: " + e.getMessage());
            // Rethrow with more context
            throw new Exception("Data processing failed for value: " + value, e);
        }
    }

    static void validateData(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Negative value not allowed: " + value);
        }
        System.out.println("Valid data: " + value);
    }
}
