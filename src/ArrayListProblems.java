import java.util.*;

public class ArrayListProblems {
    public static void main(String[] args){
        // 1. Store student names in ArrayList
        ArrayList<String> students = new ArrayList<>();
        students.add("Rahul");
        students.add("Anjali");
        students.add("Rahul");
        students.add("Vikram");

        System.out.println("Student List: " + students);

       
        // 2. Find largest element in list
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(50);
        numbers.add(30);
        numbers.add(5);

        int max = numbers.get(0);
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("\nLargest Element: " + max);

        // 3. Find smallest element
        int min = numbers.get(0);
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Smallest Element: " + min);

        // 4. Reverse the list
        ArrayList<Integer> reversed = new ArrayList<>();
        for (int i = numbers.size() - 1; i >= 0; i--) {
            reversed.add(numbers.get(i));
        }
        System.out.println("\nReversed List: " + reversed);

        // 5. Count occurrences of element
        int count = 0;
        String target = "Rahul";
        for (String name : students) {
            if (name.equals(target)) {
                count++;
            }
        }
        System.out.println("\nOccurrences of Rahul: " + count);


    }
}
