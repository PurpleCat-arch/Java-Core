class BaseClass {
    final void showMessage() {
        System.out.println("This is a final method in the base class.");
    }
}

class DerivedClass extends BaseClass {
    // void showMessage() { // This would cause a compile-time error
    //     System.out.println("Trying to override.");
    // }
}

public class FinalMethod {
    public static void main(String[] args) {
        DerivedClass obj = new DerivedClass();
        obj.showMessage(); // Inherited but cannot be overridden
    }
}
