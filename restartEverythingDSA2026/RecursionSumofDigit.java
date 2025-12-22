package restartEverythingDSA2026;

public class RecursionSumofDigit {

    public static int sumOfDighit(int n){
        if(n== 0){
            return 0;
        }
        return (n %10) +sumOfDighit(n/10);
    }

    public static int sumOfAllDigit(int n){
       int sum = 0;
        while(n!=0){
            int digit = n %10;
            sum =sum+digit;
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumOfDighit(12345));
        System.out.println(sumOfDighit(12345));

    }
}
