package JavaInterViewProgram100VVI;


     import java.util.PriorityQueue;

    public class MinHeapExample {
        public static void main(String[] args) {
            PriorityQueue<Integer> pq = new PriorityQueue<>();

            pq.offer(50);
            pq.offer(10);
            pq.offer(30);

            System.out.println("PriorityQueue: " + pq); // Order दिखेगा random, लेकिन poll() में min पहले आएगा

            System.out.println(pq.poll()); // 10
            System.out.println(pq.poll()); // 30
            System.out.println(pq.poll()); // 50
        }
    }


