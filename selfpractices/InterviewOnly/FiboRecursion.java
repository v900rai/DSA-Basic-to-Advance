package selfpractices.InterviewOnly;

import java.util.Scanner;

public class FiboRecursion {
    public static void  main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=sc.nextInt();
        int fibn=fib(num);
        System.out.println(fibn);

        }
        public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int fibn1=fib(n-1);
        int fibn2=fib(n-2);
        int fibnm=fibn1+fibn2;
        return fibnm;
        }
    }

