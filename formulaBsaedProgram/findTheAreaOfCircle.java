package formulaBsaedProgram;

import java.util.Scanner;

public class findTheAreaOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        double radius=sc.nextDouble();
        double result=3.14*radius*radius;
        System.out.println(result+" Area of Circle");
    }
}
