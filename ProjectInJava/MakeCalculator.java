package ProjectInJava;

import java.util.Scanner;

public class MakeCalculator {
    public static void main(String args[]) {

        System.out.println("Enter two Elements");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Select the operations");
        int choice=sc.nextInt();
        if(choice==1){
         int    cal= a+b;
            System.out.println("addition"+cal);
        } else if (choice==2) {
            int cal=a-b;
            System.out.println("Subtractions"+cal);

        }
        else if(choice==3){
            int cal =a*b;
            System.out.println("mul"+cal);
        }



    }

}
