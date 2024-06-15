package NumberProgram;

import java.util.Scanner;

public class Palindrome {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number pailenrom");
        int num=sc.nextInt();
        int temp=0;
        int rev;
        rev=num;
        while (num>0) {
            int r = num % 10;
            num = num / 10;
            temp = (temp * 10) + r;

        }
        if(temp==rev){
            System.out.println(" It is a Palindrome NUmber");
        }
        else{
            System.out.println("its not palindrome number");
        }
    }
}
