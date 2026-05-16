public class SuppressedExceptionDemo {
    public static void main(String[] args) {
        try (FaultyResource res = new FaultyResource()) {
            res.doWork(); // Throws primary exception
        } catch (Exception e) {
            System.out.println("Primary exception: " + e.getMessage());

            // Access suppressed exceptions from auto-close
            Throwable[] suppressed = e.getSuppressed();
            for (Throwable t : suppressed) {
                System.out.println("Suppressed exception: " + t.getMessage());
            }
        }
    }
}

class FaultyResource implements AutoCloseable {
    void doWork() throws Exception {
        System.out.println("FaultyResource doing work...");
        throw new Exception("Exception during work");
    }

    @Override
    public void close() throws Exception {
        System.out.println("FaultyResource closing...");
        throw new Exception("Exception during close");
    }
}
