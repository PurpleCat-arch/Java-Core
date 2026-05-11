import java.util.Stack;

public class StackMethods {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        
        System.out.println("Position of Apple from top: " + stack.search("Apple"));
        System.out.println("Position of Cherry from top: " + stack.search("Cherry"));
        System.out.println("Is empty? " + stack.isEmpty());
    }
}
