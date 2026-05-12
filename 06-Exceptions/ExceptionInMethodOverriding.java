import java.io.IOException;

class Parent {
    void display() throws IOException {
        System.out.println("Parent display()");
    }

    void show() {
        System.out.println("Parent show()");
    }
}

class Child extends Parent {
    // Rule 1: Can throw same exception
    @Override
    void display() throws IOException {
        System.out.println("Child display() - throws same IOException");
    }

    // Rule 2: Overridden method CANNOT throw broader checked exception
    // void show() throws Exception {} // COMPILE ERROR!

    // Rule 3: Can throw unchecked exceptions freely
    @Override
    void show() throws ArithmeticException {
        System.out.println("Child show() - can throw unchecked exception");
    }
}

public class ExceptionInMethodOverriding {
    public static void main(String[] args) {
        Parent obj = new Child();

        try {
            obj.display();
        } catch (IOException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        obj.show();

        System.out.println("\n--- Rules Summary ---");
        System.out.println("1. Overriding method can throw same or narrower checked exceptions.");
        System.out.println("2. Overriding method CANNOT throw broader checked exceptions.");
        System.out.println("3. Overriding method can throw any unchecked exceptions.");
    }
}
