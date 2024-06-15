package ArraysProgram;

import java.util.Arrays;

public class mergeProgram {
    public static void main(String []args){
        int arr[]={10, 20, 30,40};
        int arr1[]={50, 60, 80, 70};
        int []  c=new int[arr.length+arr1.length];
        for(int i=0; i<arr.length; i++){
            c[i]=arr[i];
        }
        for(int i=0; i<arr1.length; i++){
            c[i+arr.length]= arr1[i];
        }
        System.out.println("Arrays merge two"+ Arrays.toString(c));


    }
}
