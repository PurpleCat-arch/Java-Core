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

        // 6. Remove duplicates manually
        ArrayList<String> unique = new ArrayList<>();
        for (String name : students) {
            if (!unique.contains(name)) {
                unique.add(name);
            }
        }
        System.out.println("\nAfter removing duplicates: " + unique);

        // 7. Merge two ArrayLists
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);

        list1.addAll(list2);
        System.out.println("\nMerged List: " + list1);

        // 8. Find sum of all elements
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("\nSum of elements: " + sum);
        

    }
}
