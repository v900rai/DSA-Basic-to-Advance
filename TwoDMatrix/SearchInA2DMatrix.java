package TwoDMatrix;

public class SearchInA2DMatrix {

        public static boolean searchMatrix(int[][] mat, int target) {
            int row = 0;
            int col = mat[0].length - 1;
            while (row < mat.length && col >= 0) {
                if (mat[row][col] == target)
                    return true;
                else if (mat[row][col] > target)
                    col--;
                else row++;
            }
            return false;
        }

        public static void main(String[] args) {
            int[][] mat = {
                    {1, 3, 5},
                    {7, 9, 11},
                    {13, 15, 17}
            };
            int target = 9;
            System.out.println(searchMatrix(mat, target)); // Output: true
        }
    }


