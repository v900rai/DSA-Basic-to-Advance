package ExcepationHandlingInJava;

import java.util.Scanner;

public class ExepationTryCatchBlock {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the two number");
        int first=sc.nextInt();
        int second=sc.nextInt();
        try {
            int result=first/second;
            System.out.println("result is"+result);
        }
        catch (ArithmeticException exception){
            //System.out.println("Enter the value ");
            System.out.println(exception.getMessage());
            //System.out.println(exception.getCause());
        }
    }
}
