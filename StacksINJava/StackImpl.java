package StacksINJava;

class Stack{
    int top=-1;
    int size=10;
    int arr[]=new int[size];
    public   void push(int val){
        top++;
        arr[top]=val;


    }
    public  int pop(){
        int temp=arr[top];
        top--;

        return temp;

    }
    public  int peek(){
        return arr[top];

    }
    public  boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;

    }
    public void print(){
        int temp=0;
        while (temp<=top){
            System.out.println(arr[temp]);
            temp++;

        }

    }


}

public class StackImpl {
    public static void main(String[] args) {
        Stack myStack=new Stack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.print();
        System.out.println("==========");
        myStack.pop();
        myStack.print();
        System.out.println("------------");
        int temp=myStack.peek();
        System.out.println(temp);
        System.out.println("----");
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        System.out.println(myStack.isEmpty());


    }

}
