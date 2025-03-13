package ArraysInterviewPeoblem2025;

public class SumOfdigit {

    public static void main(String[] args) {
        int n = 12345;
        System.out.println(sumOfDigits(n));
    }
    public static int sumOfDigits(int n){
        int sum=0;
        while(n!=0){
            int digit=n%10;
            sum=sum+digit;
            n=n/10;
        }
        return sum;
    }
}
