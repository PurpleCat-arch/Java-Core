import java.util.TreeMap;
import java.util.Comparator;

public class TreeMapCustomSorting {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>(new Comparator<String>() {
            public int compare(String s1, String s2) {
                return s2.compareTo(s1);
            }
        });
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);
        
        System.out.println("TreeMap (custom reverse order keys): " + map);
    }
}
