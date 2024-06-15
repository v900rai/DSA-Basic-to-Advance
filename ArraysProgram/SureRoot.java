package ArraysProgram;

import java.util.Scanner;

public class SureRoot {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        double d=Math.sqrt(num);
        System.out.println(""+num +" "+d+" ");

    }
}
