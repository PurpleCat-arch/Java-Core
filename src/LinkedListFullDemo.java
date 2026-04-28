import java.util.*;

public class LinkedListFullDemo {
    public static void main(String[] args) {
        // 1. Create LinkedList and add elements
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        System.out.println("Initial List: " + list);

        // 2. Add element at beginning
        list.addFirst("Start");
        System.out.println("\nAfter addFirst(): " + list);

        // 3. Add element at end
        list.addLast("End");
        System.out.println("After addLast(): " + list);

        // 4. Remove first and last element
        list.removeFirst();
        list.removeLast();
        System.out.println("\nAfter removing first & last: " + list);

        // 5. Display list
        System.out.println("\nDisplaying List:");
        System.out.println(list);

        
        

        
    }
}
