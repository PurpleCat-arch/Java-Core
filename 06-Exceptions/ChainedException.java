public class ChainedException {
    public static void main(String[] args) {
        try {
            authenticateUser("admin", "wrong_password");
        } catch (Exception e) {
            System.out.println("Top-level exception: " + e.getMessage());
            System.out.println("Caused by: " + e.getCause());
            System.out.println("\n--- Full Stack Trace ---");
            e.printStackTrace();
        }
    }

    static void authenticateUser(String user, String pass) throws Exception {
        try {
            verifyPassword(user, pass);
        } catch (SecurityException e) {
            // Chain the original exception as the cause
            throw new Exception("Authentication failed for user: " + user, e);
        }
    }

    static void verifyPassword(String user, String pass) {
        if (!"secret123".equals(pass)) {
            throw new SecurityException("Invalid password for user '" + user + "'");
        }
        System.out.println("Password verified.");
    }
}
