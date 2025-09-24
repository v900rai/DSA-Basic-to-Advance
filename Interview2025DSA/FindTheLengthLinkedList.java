package Interview2025DSA;

public class FindTheLengthLinkedList {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    // Counts number of nodes in linked list
    public static int countNodes(Node head) {

        // Initialize count with 0
        int count = 0;

        // Initialize curr with head of Linked List
        Node curr = head;

        // Traverse till we reach null
        while (curr != null) {

            // Increment count by 1
            count++;

            // Move pointer to next node
            curr = curr.next;
        }
        // Return the count of nodes
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
                + countNodes(head));
    }
}
