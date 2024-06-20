package selfpractices;

import java.util.Scanner;

public class Odd_Even {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num %2==0){
            System.out.println("Even number only");
        }
        else{
            System.out.println("odd number");
        }
    }
}
