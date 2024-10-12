package DSA100Challenge;

import java.util.Scanner;

public class SpanArarys {
    public static  void main(String args[]) throws Exception{
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("Enter the number");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        int span=max-min;
        System.out.println(span);

    }
}
