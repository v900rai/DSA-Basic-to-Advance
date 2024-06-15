package PatternInJava;

public class bothAreEqual {
    public static void main(String[] args) {
        int n=8;
        allAreaEqual(n);
    }
    public static void allAreaEqual(int n){
        for(int i=0; i<=n; i++){
            for(int j=0; j<=n; i++){
                System.out.print("*");
            }
        }
        System.out.println();
    }

}
