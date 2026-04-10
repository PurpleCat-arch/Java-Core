
public class Main1 {
    static void staticMethod() {
        System.out.println("Static method");
    }

    void instanceMethod() {
        System.out.println("Instance method");
    }

    public static void main(String[] args) {
        Main1.staticMethod();

        Main1 obj = new Main1();
        obj.instanceMethod();
    }
}
