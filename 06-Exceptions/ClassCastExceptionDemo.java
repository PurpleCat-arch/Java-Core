public class ClassCastExceptionDemo {
    public static void main(String[] args) {
        Object obj1 = "Hello World";
        Object obj2 = Integer.valueOf(42);

        try {
            String str = (String) obj1; // Valid cast
            System.out.println("Cast successful: " + str);
        } catch (ClassCastException e) {
            System.out.println("Cast failed: " + e.getMessage());
        }

        try {
            String str = (String) obj2; // Invalid cast
            System.out.println("Cast successful: " + str);
        } catch (ClassCastException e) {
            System.out.println("Cast failed: " + e.getMessage());
        }

        // Safe approach using instanceof
        if (obj2 instanceof String) {
            System.out.println("obj2 is a String");
        } else {
            System.out.println("obj2 is NOT a String, it is: " + obj2.getClass().getSimpleName());
        }
    }
}
