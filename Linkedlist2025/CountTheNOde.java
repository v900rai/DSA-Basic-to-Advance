package Linkedlist2025;


    // Java program to illustrate creation
// and traversal of Singly Linked List

    class Node {
        int data;
        Node next;
        Node prve;


        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prve=null;
        }
    }

public class CountTheNOde {

        public static void printList(Node head) {

            // Iterate till n reaches null
            Node curr =head;
            while (curr != null) {

                // Print the data
                System.out.println(curr.data + " ");
                curr=curr.next;
            }
        }

        public static void main(String[] args) {

            //Linked List 1 -> 2 -> 3
            Node head = new Node(1);
            Node second = new Node(2);
            Node third = new Node(3);

            head.next = second;
            second.next = third;
            printList(head);
        }
    }

