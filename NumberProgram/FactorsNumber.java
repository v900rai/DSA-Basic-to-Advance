package NumberProgram;

import java.util.Scanner;

public class FactorsNumber {
    public static void main(String args[]){
        //12... 1, 2,3,4,6,12
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        for(int i=1; i<num; i++){
            if(num%i==0){
                System.out.println(i);
            }
        }
    }
}
