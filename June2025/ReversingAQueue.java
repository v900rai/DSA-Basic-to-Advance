package June2025;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReversingAQueue {

    // Function to print the queue
    // This method will dequeue and print all elements until the queue is empty
    public static void print(Queue<Integer> q) {
        // Loop until the queue is empty
        while (!q.isEmpty()) {
            // Remove the front element and print it
            System.out.print(q.poll() + " ");
        }
    }

    // Function to reverse the queue using a stack
    // Stack's LIFO property helps reverse the order of elements
    public static void reverseQueue(Queue<Integer> q) {
        // Create a stack to temporarily hold elements
        Stack<Integer> s = new Stack<>();

        // Step 1: Dequeue all elements from the queue and push them onto the stack
        while (!q.isEmpty()) {
            // Remove front element from queue and push to stack
            s.push(q.poll());
        }

        // Step 2: Pop all elements from the stack and enqueue them back to the queue
        while (!s.isEmpty()) {
            // Pop top element from stack and add to the rear of queue
            q.add(s.pop());
        }
        // Now the queue contains elements in reversed order
    }

    public static void main(String[] args) {
        // Create a queue and add elements to it
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);

        // Reverse the queue
        reverseQueue(q);

        // Print the reversed queue
        print(q);
        // Expected output: 100 90 80 70 60 50 40 30 20 10
    }

}
