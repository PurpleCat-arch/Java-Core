import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); list.add(20); list.add(30);
        
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer val = it.next();
            if (val == 20) {
                it.remove(); // Safe removal
            }
        }
        System.out.println("List after Iterator removal: " + list);
    }
}
