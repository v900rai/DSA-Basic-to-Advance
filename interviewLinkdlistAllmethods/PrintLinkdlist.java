package interviewLinkdlistAllmethods;

public class PrintLinkdlist {

    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static boolean printList(Node head){

        Node curr = head;
        while (curr !=null){
            System.out.println(curr.data);
            if(curr.next!=null)
            System.out.println(".......>");
        }
        curr=curr.next;
        return false;
    }
    public static void main(String[] args) {

        // Creating a hard-coded linked list: 1 -> 3 -> 1 -> 2 -> 1
        PrintLinkdlist.Node head = new PrintLinkdlist.Node(1);
        head.next = new PrintLinkdlist.Node(3);
        head.next.next = new PrintLinkdlist.Node(1);
        head.next.next.next = new PrintLinkdlist.Node(2);
        head.next.next.next.next = new PrintLinkdlist.Node(1);

        // Printing count of nodes
        System.out.println(printList(head));
    }


}
