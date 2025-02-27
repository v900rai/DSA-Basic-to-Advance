package LinkedListDSA;/*
 class Node{
     int data;
     Node next;
     public Node(int new_data){
         this.data=new_data;
         this.next=null;
     }
 }*/
public class SearchElementsInLinkedlist {
    public static boolean searchKey(Node head, int key) {
        Node current = head;

        // Iterate over all nodes
        while (current != null) {
            // If current node's value is equal to key, return true
            if (current.data == key) {
                return true;
            }
            // Move to the next node
            current = current.next;
        }
        // If no node with value key is found, return false
        return false;
    }

    public static void main(String[] args) {
        // Create a hard-coded linked list: 14 -> 21 -> 13 -> 30 -> 10
        Node head = new Node(14);
        head.next = new Node(21);
        head.next.next = new Node(13);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(10);

        // Key to search in the linked list
        int key = 1;

        if (searchKey(head, key))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}