package LeetcodeProblemsAndGeeksForGeeks;

public class kadaneAlgorithmMaxSubArraysSum {
    public static void main(String[] args) {
        int[] arr =  {5, 4, 1, 7, 8};

        System.out.println(kadaneAlgorithm(arr));
    }

    public static int kadaneAlgorithm(int arr[]) {
        int maxSum = arr[0], currentSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
