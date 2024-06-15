package selfpractices;

import java.io.IOException;

public class print2D {
    public static void print2d(int matrix[][]){
        for(int i=0; i<matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
        }
    }
    public static void main(String args[])
            throws IOException
    {
        int mat[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 } };
        print2d(mat);
    }
}
