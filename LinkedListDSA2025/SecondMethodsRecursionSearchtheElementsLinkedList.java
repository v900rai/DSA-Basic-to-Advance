package LinkedListDSA2025;

public class SecondMethodsRecursionSearchtheElementsLinkedList {
    public static boolean isSearchKey(Node head, int key) {
        //check whether is key present arr not
        if (head == null) {
            return false;
        }
        // if key is present in current node the u can return the true;
        if (head.data == key) {
            return true;
        }

        // Recur for remaining list
        return isSearchKey(head.next, key);
    }

    public static void main(String[] args) {
        // Create a hard-coded linked list:
        // 14 -> 21 -> 13 -> 30 -> 10
        Node head = new Node(14);
        head.next = new Node(21);
        head.next.next = new Node(13);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(10);

        // Key to search in the linked list
        int key = 14;

        if (isSearchKey(head, key)) System.out.println("Yes");
        else System.out.println("No");
    }
}
