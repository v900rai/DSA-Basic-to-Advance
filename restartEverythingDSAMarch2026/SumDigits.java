package restartEverythingDSAMarch2026;

public class SumDigits {
    public static void main(String[] args) {
        int sum = 0;
        int n = 12345;
        while (n !=0){
            sum = sum + n %10;
            n= n/10;
        }
        System.out.println(sum);
    }
}
