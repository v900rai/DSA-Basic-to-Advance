package selfpractices;

import java.util.Scanner;

public class Reverse_Number {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        while(num>0){
            int rev=num%10;
            sum=sum*10+rev;
            num=num/10;
        }

        System.out.println("Reverse of a Number is "+sum);

    }
}
