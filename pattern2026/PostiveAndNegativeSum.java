package pattern2026;

public class PostiveAndNegativeSum {
    public static void main(String[] args) {


        int[] arr = {2,-3,-5,-7,9};
        int[] ans = getPosNegSum(arr);
        System.out.println("Postive Sum ="+ans[0]);
        System.out.println("Negative Sum ="+ans[1]);

    }

    static int[] getPosNegSum(int[] arr) {
        int posSum = 0;
        int negSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                posSum = posSum + arr[i];
            } else {
                negSum = negSum + arr[i];
            }
        }
        int[] ans = {posSum, negSum};
        return ans;

    }
}
