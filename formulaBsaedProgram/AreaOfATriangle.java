package formulaBsaedProgram;

import java.util.Scanner;

public class AreaOfATriangle {
    public static void main(String[] args) {
        // formulla 0.5*height*base;
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the base");
        double base=sc.nextDouble();
        System.out.println("Enter the heigth");
        double heigth=sc.nextDouble();
        double result=0.5*base*heigth;
        System.out.println("Area of Triangle  "+result);

    }

}
