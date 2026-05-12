class InvalidEmailException extends Exception {
    InvalidEmailException(String email) {
        super("Invalid email format: '" + email + "'");
    }
}

public class CustomCheckedException {
    static void validateEmail(String email) throws InvalidEmailException {
        if (email == null || !email.contains("@") || !email.contains(".")) {
            throw new InvalidEmailException(email);
        }
        System.out.println("Valid email: " + email);
    }

    public static void main(String[] args) {
        String[] emails = {"user@gmail.com", "invalid-email", "test@site.org", null};

        for (String email : emails) {
            try {
                validateEmail(email);
            } catch (InvalidEmailException e) {
                System.out.println("Checked Exception: " + e.getMessage());
            }
        }
    }
}
