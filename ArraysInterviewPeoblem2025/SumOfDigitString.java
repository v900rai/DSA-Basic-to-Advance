package ArraysInterviewPeoblem2025;

public class SumOfDigitString {
    public static void main(String[] args) {
        String s = "123456789123456789123422";
        System.out.println(sumOfDigits(s));
    }
    public static int sumOfDigits(String s){
        int sum=0;
        for(int i=0; i<s.length(); i++){
            int digit=s.charAt(i)-'0';

            //add sun of digit
            sum=sum+digit;
        }
        return sum;
    }
}
