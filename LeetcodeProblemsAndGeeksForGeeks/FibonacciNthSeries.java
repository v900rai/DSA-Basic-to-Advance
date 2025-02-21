package LeetcodeProblemsAndGeeksForGeeks;

public class FibonacciNthSeries {
    public static int nthFibonacci(int n){
        if(n<=1){
            return n;
        }
        return nthFibonacci(n-1)+nthFibonacci(n-2);
    }
    public static void main(String arg[]){
        int n=5;
        int result=nthFibonacci(n);
        System.out.println(resultgit );
    }
}
