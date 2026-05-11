import java.util.Vector;

public class VectorBasic {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Dog");
        vector.add("Cat");
        vector.add("Bird");
        
        System.out.println("Vector elements: " + vector);
        System.out.println("Capacity: " + vector.capacity());
        vector.addElement("Fish");
        System.out.println("After addElement: " + vector);
    }
}
