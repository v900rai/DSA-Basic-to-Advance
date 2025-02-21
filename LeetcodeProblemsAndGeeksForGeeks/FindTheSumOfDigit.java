package LeetcodeProblemsAndGeeksForGeeks;

import formulaBsaedProgram.AreaOfATriangle;

public class FindTheSumOfDigit {
    public static int sumOfDigit(int n) {
        int sum = 0;
        while (n != 0) {
            int last_digit = n % 10;
            sum += last_digit;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n=12345;
        System.out.println(sumOfDigit(n));
    }

}
