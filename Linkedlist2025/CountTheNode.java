package Linkedlist2025;

class Node {
    int data;
    Node next;

    // Constructor to initialize a new node with data
    Node(int newData) {
        data = newData;
        next = null;
    }
}

public class CountTheNode {
    public static int countNode(Node head) {
        // Initialize the count with 0
        int count = 0;
        Node curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
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
        System.out.println("Count of nodes is " + countNode(head));  // Changed countNodes to countNode
    }
}