import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        
        System.out.println("Contains 20? " + numbers.contains(20));
        numbers.remove(Integer.valueOf(20));
        System.out.println("After removal: " + numbers);
        System.out.println("Size: " + numbers.size());
        numbers.clear();
        System.out.println("Is empty? " + numbers.isEmpty());
    }
}
