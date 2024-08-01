package AdvancedDataStructureInJava;
import java.util.ArrayList;

class Spirally
    {
        // Function to return a list of integers denoting spiral traversal of matrix.
        public ArrayList<Integer> spirallyTraverse ( int matrix[][]){
        ArrayList<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return result;
        }

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            // Traverse from left to right on the top row
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            // Traverse from top to bottom on the right column
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            // Traverse from right to left on the bottom row, if still within bounds
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // Traverse from bottom to top on the left column, if still within bounds
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;
    }

        public static void main (String[]args){
        Spirally sol = new Spirally();
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        ArrayList<Integer> result = sol.spirallyTraverse(matrix);
        System.out.println(result);
    }
    }

