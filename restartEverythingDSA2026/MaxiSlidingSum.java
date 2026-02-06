package restartEverythingDSA2026;

public class MaxiSlidingSum {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int windowSum = 0;
        int max = 0;

        for(int i =0; i<arr.length; i++){
            windowSum = windowSum+arr[i];

            if(i>=k-1){
                max = Math.max(max ,windowSum);
                //remove the elemnts

                windowSum = windowSum - arr[i-(k-1)];
            }
        }
        System.out.println(max);
    }
}
