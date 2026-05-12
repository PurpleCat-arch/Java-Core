import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class ConcurrentModificationDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        // WRONG: Modifying list during for-each loop
        System.out.println("=== Incorrect approach (for-each) ===");
        try {
            for (String item : list) {
                if (item.equals("Banana")) {
                    list.remove(item); // Throws ConcurrentModificationException
                }
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("ConcurrentModificationException caught!");
        }

        // CORRECT: Using Iterator.remove()
        System.out.println("\n=== Correct approach (Iterator) ===");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String item = it.next();
            if (item.equals("Banana")) {
                it.remove(); // Safe removal
                System.out.println("Removed 'Banana' safely using Iterator.");
            }
        }
        System.out.println("List after safe removal: " + list);
    }
}
