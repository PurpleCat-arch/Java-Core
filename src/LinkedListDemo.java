import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {

        // 1. Create LinkedList and add elements
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println("Initial List: " + list);

       // 2. Add element at beginning
        list.addFirst("Start");
        System.out.println("\nAfter addFirst: " + list);

        // 3. Add element at end
        list.addLast("End");
        System.out.println("After addLast: " + list);

        // 4. Remove first and last element
        list.removeFirst();
        list.removeLast();
        System.out.println("\nAfter removing first & last: " + list);

        // 5. Display list
        System.out.println("\nDisplaying List:");
        System.out.println(list);

        // 6. Iterate using iterator
        System.out.println("\nUsing Iterator:");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 7. Search element in list
        if (list.contains("B")) {
            System.out.println("\nElement B found");
        } else {
            System.out.println("\nElement B not found");
        }

        // 8. Update element
        list.set(1, "Z"); // replace index 1
        System.out.println("\nAfter update: " + list);

      

       

        
    }
}

        

       