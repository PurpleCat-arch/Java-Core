import java.util.TreeMap;

public class TreeMapMethods {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(10, "A"); map.put(20, "B"); map.put(30, "C");
        
        System.out.println("First key: " + map.firstKey());
        System.out.println("Last key: " + map.lastKey());
        System.out.println("Higher entry than 15: " + map.higherEntry(15));
        System.out.println("Lower entry than 25: " + map.lowerEntry(25));
    }
}
