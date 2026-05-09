import java.util.Vector;
import java.util.Enumeration;

public class EnumerationDemo {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("One");
        vector.add("Two");
        
        Enumeration<String> e = vector.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
