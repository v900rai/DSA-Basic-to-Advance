package Matrix;

import java.util.Scanner;

public class rowAndColon {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row");
        int row=sc.nextInt();
        System.out.println("Enter the number");
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        // for loop
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j]= sc.nextInt();
            }
        }
        // print the matrix 2-d arrys
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(arr[i][j]+"  ..");
            }
            System.out.println();
        }
    }

}
