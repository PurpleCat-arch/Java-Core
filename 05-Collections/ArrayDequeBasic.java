import java.util.ArrayDeque;

public class ArrayDequeBasic {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("Middle");
        deque.addFirst("Front");
        deque.addLast("Back");
        
        System.out.println("ArrayDeque: " + deque);
        deque.removeFirst();
        System.out.println("After removeFirst: " + deque);
    }
}
