package selfpractices;

import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=sc.nextInt();
        for(int i=0; i<10; i++){
            System.out.println();
            System.out.println(num+" * "+i+" = "+num*i);
        }
    }
}
