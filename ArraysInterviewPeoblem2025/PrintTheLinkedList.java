package ArraysInterviewPeoblem2025;

public class PrintTheLinkedList {
    public static void printList(Node head){
        while(head!=null){
            System.out.println(head.data+" ");
            head=head.next;
        }

    }
    public static void main(String[] args) {

        // Create a linked list: 10 -> 20 -> 30 -> 40
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);


        printList(head);
    }
}
