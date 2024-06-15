package BasicRecursion;

public class FibonacciSeries {
    public static void main(String[] args) {
        int count = 0;
        int a=0;
        int b=1;
        System.out.print(a);
        System.out.print(b);
        while(count <= 10){
            int ans = a + b;
            System.out.print(ans);
            a = b;
            b = ans;
            count++;
        }

    }
}
