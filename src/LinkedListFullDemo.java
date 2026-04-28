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

        // 6. Iterate using Iterator
        System.out.println("\nIterating using Iterator:");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 7. Search element in list
        String search = "Banana";
        if (list.contains(search)) {
            System.out.println("\n" + search + " found in list");
        } else {
            System.out.println("\n" + search + " not found");
        }

        

        

        
    }
}
