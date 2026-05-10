import java.util.LinkedList;

public class LinkedListBasic {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        System.out.println("LinkedList: " + list);
        list.addFirst("Zero");
        list.addLast("Fourth");
        System.out.println("After adding first/last: " + list);
    }
}
