package BasicRecursion;

import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number  ");
        int nums=sc.nextInt();
        int result=factorial(nums);
        System.out.println(result  +" ");
    }
    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        int fact1=factorial(n-1);
        return n  * fact1;
    }
}
