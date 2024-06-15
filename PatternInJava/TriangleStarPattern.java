package PatternInJava;

public class TriangleStarPattern {
    public static void main(String[] args) {
        int ans=10;
        print(ans);

    }
    public static void print(int n){
        for(int i=0; i<n; i++){
            for(int j=n-i; j>1; j--){
                System.out.print(" ");

            }
            // innner loop
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
