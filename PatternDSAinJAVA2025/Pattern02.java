package PatternDSAinJAVA2025;

public class Pattern02 {
    public static void main(String[] args) {
        int num=4;
        for(int i=1; i<=num; i++){
            for(int j=4; j>=i; j--){
                System.out.print("  * ");
            }
            System.out.println();
        }
    }
}
