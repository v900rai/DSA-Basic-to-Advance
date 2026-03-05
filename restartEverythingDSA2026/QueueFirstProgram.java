package restartEverythingDSA2026;

import java.util.LinkedList;
import java.util.Queue;

public class QueueFirstProgram {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        //System.out.println(q.poll()); // remove karta h
        System.out.println(q.peek()); //forant ko dekhta h (see front)


    }


}
