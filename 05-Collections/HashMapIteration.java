import java.util.HashMap;
import java.util.Map;

public class HashMapIteration {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        
        System.out.println("Iterating over keys:");
        for (Integer key : map.keySet()) {
            System.out.println(key);
        }
        
        System.out.println("Iterating over values:");
        for (String val : map.values()) {
            System.out.println(val);
        }
        
        System.out.println("Iterating over entries:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
