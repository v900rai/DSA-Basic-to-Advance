package DLL;

import java.util.Stack;

class Node{
    int data ;
    Node next;
    Node prev;
    public  Node(int data , Node next, Node prev){
        this.data=data;
        this.next=next;
        this.prev=prev;
    }
}


public class DoublyLinkedList {
    private static Node createDll(int arr[]){
        Node head= new Node(arr[0], null,null);
        Node tail=head;

        for(int i=1; i<arr.length; i++){
            Node newNode=new Node(arr[i], null, tail);
            tail.next=newNode;
            tail=newNode;
        }
        return head;

    }
    private static  void deleteLastElementOfDLl(Node head){
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;


        }
        Node back=temp.prev;
        temp.prev=null;
        back.next=null;

    }
    private static void reversLinkedList(Node head){
        Stack<Integer> st=new Stack<>();
        Node temp=head;
        while (temp!=null){
            st.push(temp.data);
            temp=temp.next;
        }
        temp=head;
        while (temp!=null){
            temp.data=st.peek();
            st.pop();
            temp=temp.next;
        }


    }


    public static void main(String[] args) {
        int arr[]={8,3,1,7,5};
        Node head=createDll(arr);
       // deleteLastElementOfDLl(head);
        reversLinkedList(head);

        // print
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }

    }
}
