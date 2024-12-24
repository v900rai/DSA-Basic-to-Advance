package NumberProgram;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class FindAverageNumber {
    public static double averag(double a,double b, double c){
        return (a+b+c)/3;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number ");
        double num1=sc.nextDouble();
        System.out.println("Enter the Second number ");
        double num2=sc.nextDouble();
        System.out.println("Enter the 3rd  number ");
        double num3=sc.nextDouble();
        System.out.println("Total average "+averag(num3,num2,num1));
    }
}
