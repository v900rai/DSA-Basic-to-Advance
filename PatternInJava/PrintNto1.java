package PatternInJava;

public class PrintNto1 {
    public static void printNto1(int n){
        if(n>0){
            System.out.print(n);
            printNto1(n-1);
        }
        return ;
    }

    public static void main(String[] args) {
        int v=5;
        printNto1(v);
    }
}
