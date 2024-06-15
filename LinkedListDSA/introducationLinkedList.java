package LinkedListDSA;
class Daba{
    int data;
    Daba next;
    public Daba(int data, Daba next){
        this.data=data;
        this.next=next;
    }
}

public class introducationLinkedList {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,8,9};
        Daba head=null;
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
        //BEFORE Deleting
        System.out.println("Before Deleting the last node");
        Daba mover = head;
        while (mover!=null){
            System.out.print(mover.data + " ");
            mover = mover.next;
        }

        System.out.println();

        // delete node
        Daba temp=head;
        while (temp.next.next!=null){
            temp= temp.next;
        }
        temp.next=null;

        System.out.println("After Deleting the last node");

        //Printing List
        Daba mover1 = head;
        while (mover1!=null){
            System.out.print(mover1.data + " ");
            mover1 = mover1.next;
        }




        // printing linked list
//        int count=0;
//        Daba mover=head;
//        while (mover!=null){
//            //System.out.println(mover.data);
//            mover=mover.next;
//            count++;
//        }
//        System.out.println(count);


        //Search an element, if found then say yes otherwise no
       /* int target=10;
        boolean found = false;
        Daba mover=head;
        while (mover!=null){
            //System.out.println(mover.data);
            if(mover.data==target){
                found = true;
                break;
            }
            mover=mover.next;
        }

        if(found==true){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }*/
        //System.out.println(count);
    }

}
