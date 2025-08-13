package JavaInterViewProgram100VVI;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueFIFOExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Aman");
        queue.offer("Vishal");
        queue.offer("Ravi");

        System.out.println("Queue: " + queue); // [Aman, Vishal, Ravi]

        System.out.println(queue.poll()); // Aman (पहला आया, पहला गया)
        System.out.println(queue.poll()); // Vishal
        System.out.println(queue.poll()); // Ravi
    }
}

