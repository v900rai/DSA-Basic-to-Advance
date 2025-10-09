package JavaBasicProgramLogicBuilding;

public class Pattern3d {
        public static void main(String[] args) {
            int n = 5;

            for (int i = 1; i <= n; i++) {
                for (int space = i; space < n; space++) {
                    System.out.print(" "); // spaces
                }
                for (int star = 1; star <= (2 * i - 1); star++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }


