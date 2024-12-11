package December2024;

public class LeftTrainglePattren {
    public static void main(String args[]) {
        int num = 4;
        for (int i = 1; i < 4; i++) {
            for (int k = 3; k >= i; k--)  //for space loop
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println();


        }
    }
}
