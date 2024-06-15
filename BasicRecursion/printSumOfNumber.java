package BasicRecursion;

public class printSumOfNumber {
    public static void main(String[] args) {
        int n=5;
        int sum=0;
        printSumOfNumber(n, sum);
    }
    private static void printSumOfNumber(int n, int sum){
        if(n==1) {
            sum += n;
            System.out.println(sum);
            return;
        }
        sum=sum+n;
        printSumOfNumber(n-1,sum);
    }
}
