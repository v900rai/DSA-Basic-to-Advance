package selfpractices;

import java.util.Scanner;

public class Check_Divisiblity {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number  ");
        int num=sc.nextInt();
        for(int i=0; i<num; i++){
            if(num%5==0){
                System.out.println(num+" is divisible by 5");
            }
            else{
                System.out.println(num+" is divisible by 5");
            }
        }
    }
}
