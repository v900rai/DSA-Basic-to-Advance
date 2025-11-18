package restartEverythingDSA2026;

import java.util.Arrays;

public class ProductOfArrayIteself {

    public static int[] product(int arr[]){
        int n = arr.length;
        int ans[] = new int[n];

        int left = 1;
        for(int i=0; i<n; i++){
            ans[i] = left;
            left = left*arr[i];
        }
        int right =1;
        for(int i = n-1; i>0; i--){
            ans[i] = right;
            right = right*arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(product(new int[]{1,2,3,4})));
    }

}
