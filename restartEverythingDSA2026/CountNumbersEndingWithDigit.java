package restartEverythingDSA2026;

public class CountNumbersEndingWithDigit {

    public static void main(String[] args) {
        int[] nums = {15, 25, 33, 40, 55};

        int count  =0;
        for(int n : nums){
            if(n % 10 == 5){
                count++;
            }
        }
        System.out.println("Ending with 5: " + count);


    }
}
