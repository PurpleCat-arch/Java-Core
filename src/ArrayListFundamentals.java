import java.util.ArrayList;

public class ArrayListFundamentals {
    public static void main(String[] args) {

        // 1. Create an ArrayList and add elements
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println("Initial List: " + fruits);

        // 2. Print all elements using loop
        System.out.println("\nUsing for loop:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        // 3. Remove element by index
        fruits.remove(1); // Removes Banana
        System.out.println("\nAfter removing index 1: " + fruits);


        // 4. Remove element by value
        fruits.remove("Mango");
        System.out.println("After removing Mango: " + fruits);

        
    }
}

