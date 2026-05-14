public class IllegalStateExceptionDemo {
    private boolean started = false;
    private boolean stopped = false;

    void start() {
        if (started) {
            throw new IllegalStateException("Service is already started.");
        }
        started = true;
        System.out.println("Service started.");
    }

    void process() {
        if (!started || stopped) {
            throw new IllegalStateException("Service must be started and not stopped to process.");
        }
        System.out.println("Processing data...");
    }

    void stop() {
        if (!started) {
            throw new IllegalStateException("Cannot stop a service that hasn't started.");
        }
        if (stopped) {
            throw new IllegalStateException("Service is already stopped.");
        }
        stopped = true;
        System.out.println("Service stopped.");
    }

    public static void main(String[] args) {
        IllegalStateExceptionDemo service = new IllegalStateExceptionDemo();

        // Correct sequence
        service.start();
        service.process();
        service.stop();

        System.out.println();

        // Invalid sequence
        IllegalStateExceptionDemo service2 = new IllegalStateExceptionDemo();
        try {
            service2.process(); // Not started yet
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            service2.stop(); // Not started yet
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
