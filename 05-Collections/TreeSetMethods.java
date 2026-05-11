import java.util.TreeSet;

public class TreeSetMethods {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10); set.add(20); set.add(30); set.add(40);
        
        System.out.println("First: " + set.first());
        System.out.println("Last: " + set.last());
        System.out.println("Higher than 20: " + set.higher(20));
        System.out.println("Lower than 30: " + set.lower(30));
    }
}
