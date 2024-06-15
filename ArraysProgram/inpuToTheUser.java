package ArraysProgram;

import java.util.Scanner;

public class inpuToTheUser {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ...");
        int size=sc.nextInt();
        int number[]= new int[size];
        for(int i=0; i<size; i++){
            number[i]=sc.nextInt();
            // input taking
        }
        // printin the element
        for(int i=0; i<size; i++){
            System.out.println(number[i]+" ");
        }

    }
}
