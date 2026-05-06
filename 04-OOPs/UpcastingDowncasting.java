class Machine {
    void start() {
        System.out.println("Machine started.");
    }
}

class Laptop extends Machine {
    void start() {
        System.out.println("Laptop booting up.");
    }

    void compileCode() {
        System.out.println("Compiling code...");
    }
}

public class UpcastingDowncasting {
    public static void main(String[] args) {
        // Upcasting: Child to Parent
        Machine mac = new Laptop();
        mac.start(); // Calls Laptop's overridden method
        // mac.compileCode(); // Error: Machine reference doesn't know about compileCode

        // Downcasting: Parent to Child (requires explicit casting)
        if (mac instanceof Laptop) {
            Laptop myLaptop = (Laptop) mac;
            myLaptop.compileCode(); // Now accessible
        }
    }
}
