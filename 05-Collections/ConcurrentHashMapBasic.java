import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapBasic {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        
        map.putIfAbsent(1, "Uno"); // Won't replace
        map.putIfAbsent(3, "Three");
        
        System.out.println("ConcurrentHashMap: " + map);
    }
}
