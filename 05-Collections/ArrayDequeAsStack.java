import java.util.ArrayDeque;

public class ArrayDequeAsStack {
    public static void main(String[] args) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        System.out.println("Stack (using ArrayDeque): " + stack);
        System.out.println("Popped: " + stack.pop());
        System.out.println("After pop: " + stack);
    }
}
