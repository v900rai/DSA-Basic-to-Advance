package LinkedListDSA2025;

import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        // Add elements
        q.add(10);
        q.add(20);
        q.offer(30);
        q.offer(40);

        System.out.println("Queue: " + q); // [10, 20, 30, 40]

        // Peek and Remove
        System.out.println("Front: " + q.peek()); // 10
        System.out.println("Removed: " + q.poll()); // 10 (Queue: [20, 30, 40])

        // Size and Empty Check
        System.out.println("Size: " + q.size()); // 3
        System.out.println("Is Empty? " + q.isEmpty()); // false

        // Clear Queue
        q.clear();
        System.out.println("Queue after clear: " + q); // []
    }
}
