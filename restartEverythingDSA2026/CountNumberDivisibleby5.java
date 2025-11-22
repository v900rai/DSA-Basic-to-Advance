package restartEverythingDSA2026;

public class CountNumberDivisibleby5 {
    public static void main(String args[]){
        int[] nums = {5, 10, 12, 7, 25};
        int count = 0;
        for(int n : nums){
            if( n%5 ==0){
                count++;
            }
        }
        System.out.println("Divisible by 5 "+count);
    }
}
