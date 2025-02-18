package ArraysInterviewPeoblem2025;
 class Node{
     int data;
     Node next;
     //constructor
     Node(int newDat){
         this.data=newDat;
         this.next=null;
     }
 }
public class LinkedListLength {
     public static int countNode(Node head){
         // Initialize count with 0
         int count=0;
         Node current=head;

         while(current!=null){
             count++;
             current=current.next;

         }
         return count;

     }
    // Driver code
    public static void main(String[] args) {

        // Create a hard-coded linked list:
        // 1 -> 3 -> 1 -> 2 -> 1
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(1);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        // Function call to count the number of nodes
        System.out.println("Count of nodes is "
                + countNode(head));
    }

}
