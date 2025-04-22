package recursion2025;

public class ReversNumber {
    public static void main(String[] args) {
        int nums=5;
        reversNumber(nums);
    }
    public static void reversNumber(int N){

        // Base condition
        // This condition is never met here
        if (N == 0)
            return;

        // Print the current value of N
        System.out.print( N +" ");

        // Call itself recursively
        reversNumber(N);
    }


}
