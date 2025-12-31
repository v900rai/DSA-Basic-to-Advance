

public class SlidingWindowSum {

    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 1, 3, 2}; // input array
        int k = 3; // window size

        int sum = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {

            sum =sum  +  arr[i];  // 👉 right side se element add

            // jab window ka size k ho jaye
            if(i >=k-1) {

                max = Math.max(max, sum); // 👉 max sum update

                // 👉 left side se element remove
                //sum =sum - arr[i - (k - 1)];
                sum = sum -arr[i-(k-1)];
            }
        }

        System.out.println("Maximum sum of subarray of size " + k + " is: " + max);
    }
}
