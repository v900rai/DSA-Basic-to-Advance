package NumberProgram;

import java.util.Scanner;

public class JavaFarenheitToCelsius {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the JavaFarenheitToCelsius");
        float f=sc.nextInt();
        float c=((f-32)*5)/9;
        System.out.println("Celcius="+c);

    }
}
