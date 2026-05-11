import java.util.TreeSet;
import java.util.Comparator;

public class TreeSetCustomSorting {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>(new Comparator<String>() {
            public int compare(String s1, String s2) {
                return s2.compareTo(s1); // Reverse order
            }
        });
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        
        System.out.println("TreeSet (custom reverse order): " + set);
    }
}
