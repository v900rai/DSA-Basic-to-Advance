package DSA100Challenge;

import java.util.Scanner;

public class StringProgramAllMethods {
    public static void main(String args[]) {
        System.out.println("Enter the elements ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        /*char ch = 0;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
        }
        System.out.println(" print the character  " + ch);
*/

 int count =0;
 for(int i=0; i<str.length(); i++) {
     char ch = str.charAt(i);
     if (Character.isUpperCase(ch))
         count++;
     }
     System.out.println(count);


    }
}
