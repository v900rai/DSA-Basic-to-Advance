package LeetcodeProblemsAndGeeksForGeeks;

public class SortedArraysFindtheSingleElements {

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 4, 5, 5, 7, 7, 8, 8};
        System.out.println(single(arr));
    }
    public static int single(int []nums) {
        int xor=0;
        for (int i=0; i<nums.length; i++){
            xor^=nums[i];
        }
        return xor;
    }
}
