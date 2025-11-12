package restartEverythingDSA2026;

public class TwoPointerExample {

    public static boolean pairSum(int[] arr, int target ){
        int left =0;
        int right =  arr.length-1;

        while(left < right){
            int sum = arr[left] + arr[right];

            if(sum == target){
                return true; // pair found;
            }
            else if(sum<target){
                left++; //increase
            }
            else {
                right--;
            }
        }
        return false; // no pair found
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 11, 15};
        int target = 15;

        System.out.println(pairSum(arr, target)); // Output: true
    }
}
