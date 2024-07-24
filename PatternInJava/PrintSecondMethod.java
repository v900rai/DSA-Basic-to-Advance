package PatternInJava;

public class PrintSecondMethod {
    public static void main(String[] args) {
        int num=5;
        int print =1;
        for(int i=1; i<num; i++){
            for(int j=1; j<print; i++){
                System.out.print(" * ");
            }
            print++;
            System.out.println();
        }
    }
}
