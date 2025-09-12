package interviewLinkdlistAllmethods;


public class LinkedListCount {

    // Inner class for Node
    static class Node {
        int data;
        Node next;

        // Constructor to initialize node with given data
        Node(int new_data) {
            data = new_data;
            next = null;
        }
    }




    // Recursive function to count number of nodes
    public static int countNodes(Node head) {
        if (head == null) {
            return 0; // Base case
        }
        return 1 + countNodes(head.next); // Recursive call
    }



    // Counts number of nodes in linked list
    public static int counttNodes(Node head) {
        int count = 0;
        Node curr = head;
        while(curr != null){
            count++;
            curr=curr.next;
        }
        return count;

    }

    public static void main(String[] args) {

        // Creating a hard-coded linked list: 1 -> 3 -> 1 -> 2 -> 1
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(1);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        // Printing count of nodes
        System.out.println("Count of nodes is " + countNodes(head));
        System.out.println("Count of nodes is "+counttNodes(head));
    }
}
