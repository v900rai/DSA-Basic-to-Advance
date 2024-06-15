package formulaBsaedProgram;

import java.util.Scanner;

public class findTheAreaOfSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side one ");
        double sideOne=sc.nextDouble();
        System.out.println("Enter the side two");
        double sideTwo=sc.nextDouble();
        double result=sideOne*sideTwo;
        System.out.println("Area of Square "+result);
    }
}
