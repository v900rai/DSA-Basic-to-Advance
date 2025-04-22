package recursion2025;

public class SumWIthRecursion {
    public static void main(String[] args) {
        int nums=5;
        System.out.println(sum(nums));
    }
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return n+sum(n-1);
    }

}
