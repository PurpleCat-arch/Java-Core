class AppException extends Exception {
    AppException(String msg) { super(msg); }
}

class DatabaseException extends AppException {
    DatabaseException(String msg) { super(msg); }
}

class ConnectionException extends DatabaseException {
    ConnectionException(String msg) { super(msg); }
}

public class ExceptionWithInheritance {
    public static void main(String[] args) {
        // Catching subclass exception
        try {
            throw new ConnectionException("Connection timed out");
        } catch (ConnectionException e) {
            System.out.println("ConnectionException caught: " + e.getMessage());
        }

        // Parent catch block catches child exceptions too
        try {
            throw new ConnectionException("DB server unreachable");
        } catch (AppException e) {
            System.out.println("AppException caught (actual type: "
                    + e.getClass().getSimpleName() + "): " + e.getMessage());
        }

        // Demonstrating hierarchy
        ConnectionException ce = new ConnectionException("Test");
        System.out.println("\n--- instanceof checks ---");
        System.out.println("ConnectionException instanceof DatabaseException: " + (ce instanceof DatabaseException));
        System.out.println("ConnectionException instanceof AppException: " + (ce instanceof AppException));
        System.out.println("ConnectionException instanceof Exception: " + (ce instanceof Exception));
    }
}
