package LinkedListDSA2025;

public class FindTheLengthOfRecursionMethodsInLinkedList {
    public static int countLength(Node head) {
        //base case h ye
        if (head == null) {
            return 0;
        }
        // Count this node plus the rest of the list
        return 1 + countLength(head.next);
    }

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
                + countLength(head));
    }

}
