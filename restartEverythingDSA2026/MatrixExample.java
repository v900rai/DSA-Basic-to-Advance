package restartEverythingDSA2026;


    import java.util.*;

    public class MatrixExample {
        public static void main(String[] args) {

            // 2D matrix as List of List
            List<List<Integer>> matrix = new ArrayList<>();

            matrix.add(Arrays.asList(1, 2, 3));
            matrix.add(Arrays.asList(4, 5, 6));
            matrix.add(Arrays.asList(7, 8, 9));

            // Printing matrix
            System.out.println("Matrix:");
            for (List<Integer> row : matrix) {
                for (int val : row) {
                    System.out.print(val + " ");
                }
                System.out.println();
            }
        }
    }


