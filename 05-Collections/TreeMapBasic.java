import java.util.TreeMap;

public class TreeMapBasic {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(3, "Three");
        map.put(1, "One");
        map.put(2, "Two");
        
        System.out.println("TreeMap (sorted by keys automatically): " + map);
    }
}
