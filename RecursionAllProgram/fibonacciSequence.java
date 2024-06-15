package RecursionAllProgram;

public class fibonacciSequence {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        int n=7;
        fibonacciSeries(a,b,n-2);
    }
    public static  void fibonacciSeries(int a, int b, int n ){
        if( n==0){
            return;
        }
         int   c=a+b;
        System.out.println(c);
        fibonacciSeries(b,c,n-1);
    }
}
