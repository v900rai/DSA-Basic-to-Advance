package restartEverythingDSA2026;

public class PascalTriangle {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<n;i++){
            int count = 1;
            for(int s=1;s<=n-i;s++)
                System.out.print(" ");
            for(int j=0;j<=i;j++){
                System.out.print(count + " ");
                count = count * (i - j) / (j + 1);
            }
            System.out.println();
        }

    }
}
