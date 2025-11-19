package restartEverythingDSA2026;



import java.util.LinkedList;
import java.util.Queue;

public class QueueExample1 {
    public static void main(String[] args) {

        // Queue using LinkedList
        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);   // add element
        queue.add(20);
        queue.add(30);

        System.out.println("Queue: " + queue);

        // remove() → removes front element
        System.out.println("Removed: " + queue.remove());

        // peek() → front element without removing
        System.out.println("Front element: " + queue.peek());

        System.out.println("Queue after operations: " + queue);
    }
}
