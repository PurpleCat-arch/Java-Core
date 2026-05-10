import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A"); list.add("B"); list.add("C");
        
        ListIterator<String> lit = list.listIterator();
        System.out.println("Forward:");
        while (lit.hasNext()) System.out.println(lit.next());
        
        System.out.println("Backward:");
        while (lit.hasPrevious()) System.out.println(lit.previous());
    }
}
