public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        String[] values = {"123", "45.67", "abc", "789", ""};

        for (String val : values) {
            try {
                int num = Integer.parseInt(val);
                System.out.println("Parsed '" + val + "' => " + num);
            } catch (NumberFormatException e) {
                System.out.println("Cannot parse '" + val + "': " + e.getMessage());
            }
        }
    }
}
