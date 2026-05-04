interface MyInterface {
    void regularMethod();

    default void defaultMethod() {
        System.out.println("This is a default method in the interface.");
    }
}

class MyClass implements MyInterface {
    public void regularMethod() {
        System.out.println("Implementing regular method.");
    }
}

public class DefaultMethodInInterface {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.regularMethod();
        obj.defaultMethod(); // Calling default method provided by interface
    }
}
