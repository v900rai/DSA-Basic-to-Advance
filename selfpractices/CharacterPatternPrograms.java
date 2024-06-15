package selfpractices;

import java.util.Scanner;

public class CharacterPatternPrograms {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many rows you want in this pattern?");

        int rows = sc.nextInt();

        System.out.println("Here is your pattern....!!!");
        for(int i=0; i<rows; i++){
            char ch='A';
            for (int j=1; j<i; j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }

    }
}
