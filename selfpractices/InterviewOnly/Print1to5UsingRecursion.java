package selfpractices.InterviewOnly;

import java.util.Scanner;

public class Print1to5UsingRecursion {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        printDecreasing(num);
    }
    public static void printDecreasing(int n){
        System.out.println(n);
        printDecreasing(n-1);
    }
}
