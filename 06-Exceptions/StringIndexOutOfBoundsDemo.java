public class StringIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        String text = "Hello";

        int[] indices = {0, 3, 5, -1, 10};
        for (int idx : indices) {
            try {
                char ch = text.charAt(idx);
                System.out.println("charAt(" + idx + ") = '" + ch + "'");
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("charAt(" + idx + ") => Error: " + e.getMessage());
            }
        }

        System.out.println("\n--- Substring demo ---");
        try {
            String sub = text.substring(2, 10);
            System.out.println("Substring: " + sub);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Substring error: " + e.getMessage());
        }
    }
}
