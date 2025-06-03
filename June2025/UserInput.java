package June2025;

import java.util.Scanner;

public class UserInput {
    public static void main(String arg[]){

        // Scanner class with System.in
        Scanner sc = new Scanner(System.in);
        // Taking input from the user
        int x = sc.nextInt();
        int y = sc.nextInt();
        // Printing the output
        System.out.printf("Addition: %d", x + y);
    }
}
