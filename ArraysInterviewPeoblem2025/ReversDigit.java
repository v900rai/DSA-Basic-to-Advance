package ArraysInterviewPeoblem2025;

public class ReversDigit {
    public static void main(String[] args) {
        int num = 4562;
        System.out.println(reverseDigits(num));
    }
    public static int reverseDigits(int n){
        int revDigit=0;
        while (n>0){
            int digit=n%10;
            revDigit=revDigit*10+digit;
            n=n/10;
        }
        return revDigit;
    }
}
