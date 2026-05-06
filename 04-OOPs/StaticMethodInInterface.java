interface MathOperations {
    static int add(int a, int b) {
        return a + b;
    }
}

public class StaticMethodInInterface {
    public static void main(String[] args) {
        // Can be called directly on the interface name
        int sum = MathOperations.add(10, 20);
        System.out.println("Sum is: " + sum);
    }
}
