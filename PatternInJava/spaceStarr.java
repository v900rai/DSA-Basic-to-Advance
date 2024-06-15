package PatternInJava;

import java.util.Scanner;

public class spaceStarr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name");
        int num=sc.nextInt();
        int st=1;
        int spce=num-1;
        for(int i=1; i<=num; i++){
            //System.out.println(spce+" "+st);
            for(int j=1; j<=spce; j++){
                System.out.print(' ');
            }
            for(int j=1;  j<=st; j++){
                System.out.print(st);
            }
            spce --;
            st ++;
            System.out.println();
        }



    }

}
