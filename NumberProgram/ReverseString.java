package NumberProgram;

import java.util.Scanner;

public class ReverseString {
    public static void main(String args[])
    {
        String str, reverse = "";
        int i, length;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any String:");
        str = scanner.nextLine();
        length = str.length();

        // Reversing a string
        for (i = length - 1; i >= 0; i--)
        {
            reverse = reverse + str.charAt(i);
        }

        System.out.println("After Reversed String: " + reverse);
    }
}
