import java.util.HashSet;

public class HashSetMethods {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        
        System.out.println("Contains 20? " + set.contains(20));
        set.remove(20);
        System.out.println("After removing 20: " + set);
        System.out.println("Size: " + set.size());
    }
}
