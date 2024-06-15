package NumberProgram;

import java.util.Scanner;

public class countDigitNumber {
    public static void main(String  []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int dig=0;
        while(n!=0){
            n=n/10;
            dig++;
        }
        System.out.println("count the digit number ...>"+dig);
    }
}
