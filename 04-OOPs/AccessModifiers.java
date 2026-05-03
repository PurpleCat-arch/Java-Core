class DummyClass {
    public int publicVar = 1;
    protected int protectedVar = 2;
    int defaultVar = 3; // package-private
    private int privateVar = 4;

    public void showPrivate() {
        System.out.println("Private var accessible within class: " + privateVar);
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        DummyClass obj = new DummyClass();
        System.out.println("Public: " + obj.publicVar);
        System.out.println("Protected: " + obj.protectedVar);
        System.out.println("Default: " + obj.defaultVar);
        // System.out.println(obj.privateVar); // Error: private access
        obj.showPrivate();
    }
}
