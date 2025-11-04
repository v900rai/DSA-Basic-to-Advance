package ArraysTop50InterveiwProblemsGFG;

public class factorial {
    public static void main(String[] args) {
        int n=5;
        int sum=1;
        printSumOfNumber(n, sum);
    }
    private static void printSumOfNumber(int n, int sum){
        if(n==1) {
            sum *= n;
            System.out.println(sum);
            return;
        }
        sum=sum*n;
        printSumOfNumber(n-1,sum);
    }
}
