import java.util.HashMap;

public class HashMapBasic {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);
        
        System.out.println("HashMap: " + map);
        System.out.println("Bob's age: " + map.get("Bob"));
    }
}
