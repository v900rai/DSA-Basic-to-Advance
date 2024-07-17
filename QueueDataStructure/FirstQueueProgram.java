package QueueDataStructure;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.LinkedList;
import java.util.Queue;

public class FirstQueueProgram {
    public static void main(String args[]){
        System.out.println("I am creating Queue program");
        Queue<Integer> q=new LinkedList<>();
        q.offer(10);
        q.offer(20);

        q.offer(30);

        q.offer(40);
        q.offer(50);
        System.out.println(q);
        /*System.out.println("Removing the first element the Queue in the poll methods ");
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println("===================");

        System.out.println(q.peek());
        System.out.println(q);*/

        // how to iterate the whole elements
        while(!q.isEmpty()){
            System.out.println(q.poll());
        }



    }
}
