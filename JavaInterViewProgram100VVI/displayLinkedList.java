package JavaInterViewProgram100VVI;

public class displayLinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        public Node(int i) {
        }
    }

    void Node(int data, Node next) {
        data = data;
        next = next;

    }

    /* This function prints contents of the linked list starting from head */
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " \n");
            temp = temp.next;
        }
    }

    // main methods
    public static void main(String[] args) {
        displayLinkedList list=new  displayLinkedList();
        list.head       = new Node(100);
        Node second      = new Node(200);
        Node third       = new Node(300);

        list.head.next = second; // Link first node with the second node  
        second.next = third; // Link first node with the second node  
        list.display();


    }
}