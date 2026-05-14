public class MultiCatchBlock {
    public static void main(String[] args) {
        Object[] items = {"Hello", 42, null, "123", new int[]{1}};

        for (Object item : items) {
            try {
                // Force potential exceptions
                String str = (String) item;
                int num = Integer.parseInt(str);
                System.out.println("Parsed: " + num);

            // Multi-catch: single block handles multiple exception types (Java 7+)
            } catch (ClassCastException | NumberFormatException | NullPointerException e) {
                System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage());
            }
        }
    }
}
