package Linkedlist2025;

// Java program to illustrate creation
// and traversal of doubly Linked List
class Node1 {
    int data;
    Node1 next;
    Node1 prev;

    public Node1(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class LinkedlistForwordtoBackword {

    static void forwardTraversal(Node1 head) {
        Node1 curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    static void backwardTraversal(Node1 tail) {
        Node1 curr = tail;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Linked List 1 <-> 2 <-> 3
        Node1 head = new Node1(1);  // First node is head
        Node1 second = new Node1(2);
        Node1 third = new Node1(3);
        Node1 tail = third;       // Last node is tail

        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;

        System.out.println("Forward Traversal:");
        forwardTraversal(head);

        System.out.println("Backward Traversal:");
        backwardTraversal(tail);
    }
}