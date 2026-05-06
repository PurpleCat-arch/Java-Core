public class StaticBlock {
    static int value;

    static {
        System.out.println("Static block executed.");
        value = 100;
    }

    public static void main(String[] args) {
        System.out.println("Main method executed.");
        System.out.println("Value initialized in static block: " + value);
    }
}
