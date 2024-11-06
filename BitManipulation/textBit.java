package BitManipulation;

public class textBit {
    public static void main(String[] args) {
        int[] arr = { 5,4,3,2,4,5,2};
        int ans=0;
        for (int j : arr) {
            ans=ans ^ j;


        }
        System.out.println(ans);
    }
}
