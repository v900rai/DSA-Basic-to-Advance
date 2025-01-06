package Interview2025DSA;


    import java.util.Scanner;

    public class PrimeCheck {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            boolean isPrime = true;
            if (num <= 1) isPrime = false;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            System.out.println(num + (isPrime ? " is a Prime Number." : " is not a Prime Number."));
        }


}