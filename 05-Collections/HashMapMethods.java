import java.util.HashMap;

public class HashMapMethods {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("US", "United States");
        map.put("IN", "India");
        
        System.out.println("Contains key 'IN'? " + map.containsKey("IN"));
        System.out.println("Contains value 'India'? " + map.containsValue("India"));
        
        map.remove("US");
        System.out.println("After removing 'US': " + map);
    }
}
