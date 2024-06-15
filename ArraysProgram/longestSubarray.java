package ArraysProgram;

public class longestSubarray {
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        int k = 10;
        int len = getLongestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
    public static int getLongestSubarray(int []a, int k){
        int len=0;
        for(int i=0; i<a.length; i++){
            for(int j=i; j<a.length; j++){
                int sum = 0;
                for(int K=i; K<j; K++ ){
                    sum+=a[K];
                }
                if(sum== len)
                    len= Math.max(len, j-1);
            }
        }
        return len;

    }
}
