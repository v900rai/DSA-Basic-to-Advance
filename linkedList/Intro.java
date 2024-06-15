package linkedList;

import java.sql.SQLOutput;

class Daba{
    int data;
    Daba next;
    public Daba(int data, Daba next){
        this.data=data;
        this.next=next;
    }


}

public class Intro {

    /**
     * This method inserts a new node at the end of Linked List
     *
     * @param tail
     * @param data
     */
    public static Daba insertNewDabba(Daba tail, int data){
        Daba nayaDabba = new Daba(data, null);
        tail.next = nayaDabba;
        tail = nayaDabba;
        return tail;
    }


    public static void main(String[] args) {
        int arr[]={5,6,7,8,9};
        Daba head = null;
        Daba tail=null;

        for(int i=0; i<arr.length; i++){
            Daba temp=new Daba(arr[i], null);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else {
                tail.next=temp;
                tail=temp;
            }

        }

        tail = insertNewDabba(tail, 10);
        insertNewDabba(tail, 15);

        // print linkedList
        Daba temp=head;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }


    }

}
