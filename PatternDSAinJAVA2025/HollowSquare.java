package PatternDSAinJAVA2025;

/**
 *  * * * *
 *  *     *
 *  *     *
 *  * * * *
 */

public class HollowSquare {



        public static void main(String[] args) {
            int n = 4;

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    // Print * at borders
                    if (i == 1 || i == n || j == 1 || j == n) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  "); // inner space
                    }
                }
                System.out.println();
            }
        }


}
