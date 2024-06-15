package NumberProgram;

import java.util.Scanner;

public class printTableInJava {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ....>");
        int num=sc.nextInt();
        int table =1;
        for(int i=1; i<+num; i++){
            table=num*i;
            System.out.print(table+",, ..");

        }

    }
}
