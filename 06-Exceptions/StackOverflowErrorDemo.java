public class StackOverflowErrorDemo {
    public static void main(String[] args) {
        try {
            recursiveMethod(1);
        } catch (StackOverflowError e) {
            System.out.println("StackOverflowError caught!");
            System.out.println("Infinite recursion caused the stack to overflow.");
        }
    }

    static void recursiveMethod(int count) {
        System.out.println("Call #" + count);
        recursiveMethod(count + 1); // No base case = infinite recursion
    }
}
