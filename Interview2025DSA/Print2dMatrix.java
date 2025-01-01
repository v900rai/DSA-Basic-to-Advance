package Interview2025DSA;

import java.io.IOException;

public class Print2dMatrix {
    public static void main(String args[])
            throws IOException
    {
        int mat[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 } };
        print2D(mat);
    }
    public static  void print2D(int mat[][]){
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat.length; j++){
                System.out.print(mat[i][j]+" , ");
            }
            System.out.println();
        }
    }
}
