package formulaBsaedProgram;

import java.util.Scanner;

public class areaOfTrangle {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lenght");
        double length=sc.nextDouble();
        System.out.println("Enter the breadth");
        double breadth=sc.nextDouble();
        double result=length*breadth;
        System.out.println(result+" Area Of Rectangle");

    }

}
