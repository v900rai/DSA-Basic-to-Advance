package Linkedlistttt;

public class HowtocreateLinkedlist {
    public static void main(String args[]){
        Node node1=new Node(1);
        Node node2=new Node(2);
        Node node3=new Node(3);
        Node node4=new Node(4);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        System.out.println(node1.data);
        System.out.println(node1.next.data);




    }


}
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;

    }
}
