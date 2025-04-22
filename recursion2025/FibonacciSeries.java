package recursion2025;

public class FibonacciSeries {
    public static void main(String args[]){
        int n=10;
        int a=0;
        int b=1;
        System.out.print("Fibonacci Series till " + n + " terms: ");
        for(int i=0; i<n; i++){
            System.out.print(a+" ");
            // next number = sum of previous two
            int next=a+b;
            a=b;
            b=next;
        }
    }
}
