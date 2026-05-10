import java.util.LinkedList;

public class LinkedListMethods {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        
        list.removeFirst();
        list.removeLast();
        System.out.println("After removing first/last: " + list);
    }
}
