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


    }
}
