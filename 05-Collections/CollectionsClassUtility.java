import java.util.ArrayList;
import java.util.Collections;

public class CollectionsClassUtility {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); list.add(5); list.add(20);
        
        System.out.println("Max: " + Collections.max(list));
        System.out.println("Min: " + Collections.min(list));
        Collections.reverse(list);
        System.out.println("Reversed: " + list);
    }
}
