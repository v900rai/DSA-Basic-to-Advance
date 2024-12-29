package Interview2025DSA;

public class maximumElementInAMatrixJava {
    // Java code to find max element in a matrix



        final static int N = 4;
        final static int M = 5 ;

        // Function to find max element
        // mat[][] : 2D array to find max element
        static int findMax(int mat[][])
        {

            // Initializing max element as INT_MIN kr diya hu
            int maxElement = Integer.MIN_VALUE;

            // checking each element of matrix
            // if it is greater than maxElement,
            // update maxElement
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (mat[i][j] > maxElement) {
                        maxElement = mat[i][j];
                    }
                }
            }

            // finally return maxElement
            return maxElement;
        }


        // Driver code
        public static void main(String args[])
        {
            // matrix
            int mat[][] = { { 1, 2, 3, 4,6 },
                    { 25, 6, 7, 8 ,99},
                    { 9, 10, 11, 12,44 },
                    { 13, 14, 15, 16 ,34} };

            System.out.println(findMax(mat)) ;

        }



}
