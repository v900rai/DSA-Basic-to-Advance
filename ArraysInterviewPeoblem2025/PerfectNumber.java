package ArraysInterviewPeoblem2025;

public class PerfectNumber {

    public static boolean isPerfect(int n){
        int sum=0;
        for(int i=1; i<n; i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        return sum==n;
    }
    public static void main(String[] args) {
        int ans=7;
        System.out.println(isPerfect(ans) ? "true" : "false");
    }
}
