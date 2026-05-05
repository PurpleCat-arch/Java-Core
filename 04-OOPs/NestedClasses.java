class OuterClass {
    private String outerMessage = "Message from Outer";

    class InnerClass {
        void display() {
            System.out.println("Accessing from Inner: " + outerMessage);
        }
    }

    static class StaticNestedClass {
        void display() {
            System.out.println("Inside static nested class.");
            // Cannot access non-static members of outer class directly
        }
    }
}

public class NestedClasses {
    public static void main(String[] args) {
        // Instantiating regular inner class
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();

        // Instantiating static nested class
        OuterClass.StaticNestedClass staticNested = new OuterClass.StaticNestedClass();
        staticNested.display();
    }
}
