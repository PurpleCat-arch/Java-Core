public class ConstructorChaining {
    ConstructorChaining() {
        this(10);
        System.out.println("Default Constructor");
    }

    ConstructorChaining(int x) {
        this(10, 20);
        System.out.println("One parameter: " + x);
    }

    ConstructorChaining(int x, int y) {
        System.out.println("Two parameters: " + (x + y));
    }

    public static void main(String[] args) {
        ConstructorChaining obj = new ConstructorChaining();
        System.out.println(obj);
    }
}
