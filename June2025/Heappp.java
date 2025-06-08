package June2025;

import java.util.PriorityQueue;

public class Heappp {
    public static void main(String args[]) throws Exception{
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int [] ranks={22, 99, 3,1,88,4};
        for(int val :ranks){
            pq.add(val);
        }
        while (pq.size()>0){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
