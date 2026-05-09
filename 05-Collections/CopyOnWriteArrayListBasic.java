import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Iterator;

public class CopyOnWriteArrayListBasic {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("A");
        list.add("B");
        
        Iterator<String> it = list.iterator();
        list.add("C"); // Will not throw ConcurrentModificationException
        
        while(it.hasNext()){
            System.out.println("Iterator reads: " + it.next());
        }
        System.out.println("Actual list: " + list);
    }
}
