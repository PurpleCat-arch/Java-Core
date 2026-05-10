import java.util.Hashtable;

public class HashTableBasic {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>();
        table.put(1, "A");
        table.put(2, "B");
        table.put(3, "C");
        
        System.out.println("Hashtable: " + table);
        // table.put(4, null); // Throws NullPointerException
    }
}
