package LinkedListDSA2025;




// Java program to illustrate how to find the middle element
// by using Floyd's Cycle Finding Algorithm

// A singly linked list node
class Node {
    int data;
    Node next;

    // Constructor to initialize a new node with data
    Node(int new_data) {
        this.data = new_data;
        this.next = null;
    }
}

public class FindMiddleLinkedlist {

    // Function to get the middle of the linked list
    public static int getMiddle(Node head) {

        // Initialize the slow and fast pointer to the head
        // of the linked list
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            // Move the fast pointer by two nodes
            fast = fast.next.next;

            // Move the slow pointer by one node
            slow = slow.next;
        }

        // Return the slow pointer which is currently
        // pointing to the middle node of the linked list
        return slow.data;
    }

    // Driver code
    public static void main(String[] args) {

        // Create a hard-coded linked list:
        // 10 -> 20 -> 30 -> 40 -> 50 -> 60 -> 70
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        head.next.next.next.next.next.next = new Node(70);
        head.next.next.next.next.next.next.next = new Node(70);


        // Example of printing the middle value of the
        // linked list
        System.out.println(
                "Middle Value Of Linked List is: "
                        + getMiddle(head));
    }
}
