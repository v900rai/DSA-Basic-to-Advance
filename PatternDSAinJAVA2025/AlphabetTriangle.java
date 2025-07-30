package PatternDSAinJAVA2025;

public class AlphabetTriangle {
    public static  void main(String arsg[]){
        int n=4;
        char ch ='A';
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch+" ");

            }
            ch++;
            System.out.println();
        }
    }
}
