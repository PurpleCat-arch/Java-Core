final class CannotBeExtended {
    void display() {
        System.out.println("This class cannot have subclasses.");
    }
}

// class TryingToExtend extends CannotBeExtended { } // This causes compile-time error

public class FinalClass {
    public static void main(String[] args) {
        CannotBeExtended obj = new CannotBeExtended();
        obj.display();
    }
}
