package graph202666;

import java.util.LinkedList;
import java.util.Queue;

class Node{
     int data;
     Node left;
     Node right;
     public Node(int data){
         this.data = data;
         this.left = null;
         this.right = null;

     }
 }


public class SimpleBFS {

     public static void bfs(Node root){
         // steps one queue bano
         Queue<Node> q = new LinkedList<>();

         // Step 2: Root ko queue me daalo
         q.add(root);

         // // Step 3: Jab tak queue empty na ho tab tak chalao
         while (!q.isEmpty()){

             // Step 3: Jab tak queue empty na ho tab tak chalao
             Node curr = q.poll();

             // Step 5: Uska data print karo
             System.out.print(curr.data + " ");

             // Step 6: Agar left child hai to queue me daal do

             if(curr.left!= null){
                 q.add(curr.left);

             }
             // Step 7: Agar right child hai to queue me daal do
             if (curr.right != null) {
                 q.add(curr.right);
             }


         }
     }
    public static void main(String[] args) {

        // Tree create kar rahe hain yaha
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // BFS call
        bfs(root);
    }
}
