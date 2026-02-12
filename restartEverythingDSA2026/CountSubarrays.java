package restartEverythingDSA2026;

public class CountSubarrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        int total = countSubarrays(arr);
        System.out.println("Total Subarrays: " + total);
    }
    public static int countSubarrays(int[] arr){
        int  n= arr.length;
        return n*(n+1)/2;
    }
}
