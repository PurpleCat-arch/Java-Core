public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        String[] names = {"Alice", null, "Charlie", null, "Eve"};

        for (int i = 0; i < names.length; i++) {
            try {
                System.out.println("Name " + i + " uppercase: " + names[i].toUpperCase());
            } catch (NullPointerException e) {
                System.out.println("Name " + i + " is null, cannot process.");
            }
        }
    }
}
