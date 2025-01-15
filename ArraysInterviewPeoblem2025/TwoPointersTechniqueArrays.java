package ArraysInterviewPeoblem2025;

public class TwoPointersTechniqueArrays {

    public static void main(String[] args) {

        int[] arr = {0, -1, 2, -3, 1};
        int target = -2;

        // Call the twoSum function and print the result
        if (twoSum(arr, target))
            System.out.println("true");
        else
            System.out.println("false");
    }

    public static boolean twoSum(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
