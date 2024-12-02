package December2024;

import java.util.Scanner;

public class Hello {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        String nums=sc.next();
        for(int i=0; i<nums.length(); i++){
            System.out.println(nums);
        }
    }
}
