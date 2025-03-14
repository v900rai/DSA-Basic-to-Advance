package ArraysInterviewPeoblem2025;

public class GCDInjava {

    // Driver code
    public static void main(String[] args)
    {
        int a = 98, b = 56;
        System.out.print("GCD of " + a + " and " + b
                + " is " + gcd(a, b));
    }
    public static int gcd(int a, int b){
        int result=Math.min(a ,b);
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
            result--;
        }

        // Return gcd of a and b
        return result;

    }
}
