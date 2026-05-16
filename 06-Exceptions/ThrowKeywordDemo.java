public class ThrowKeywordDemo {
    public static void main(String[] args) {
        try {
            validateAge(25);
            validateAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age " + age + " is not valid. Must be 18+.");
        }
        System.out.println("Age " + age + " is valid.");
    }
}
