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

         // 5. Update element at index
        fruits.set(1, "Pineapple");
        System.out.println("\nAfter updating index 1: " + fruits);

        // 6. Check if element exists
        if (fruits.contains("Apple")) {
            System.out.println("\nApple is present in the list");
        } else {
            System.out.println("\nApple is not present");
        }

        // 7. Get element at specific index
        System.out.println("\nElement at index 0: " + fruits.get(0));

        // 8. Find size of list
        System.out.println("\nSize of list: " + fruits.size());

        // 9. Iterate using for-each loop
        System.out.println("\nUsing for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 10. Clear the list
        fruits.clear();
        System.out.println("\nAfter clearing list: " + fruits);
    }
}

