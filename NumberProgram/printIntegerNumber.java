package NumberProgram;

import java.util.Scanner;

public class printIntegerNumber {
    public static void main(String []args){
        // Input the integer
        System.out.println("Enter the integer: ");
        Scanner sc= new Scanner(System.in);
        // Read the next integer from the screen
         int num = sc.nextInt();

        // Display the integer
        System.out.println("Entered integer is: "
                + num);

    }
}
