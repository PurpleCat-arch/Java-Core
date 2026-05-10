import java.util.PriorityQueue;

public class PriorityQueueBasic {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(20);
        
        System.out.println("PriorityQueue elements: " + pq);
        System.out.println("Head (lowest element): " + pq.peek());
        System.out.println("Removed head: " + pq.poll());
        System.out.println("After poll: " + pq);
    }
}
