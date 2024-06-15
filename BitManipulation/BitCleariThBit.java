package BitManipulation;

public class BitCleariThBit {
    public static void main(String[] args) {
//        int n=13;
//        int i=2;
//        int leftShift=1<<i;
//        int mask=~leftShift;
//
//        int ans=n & mask;
//        System.out.println(ans);
            int a = 10;
            int b = 7;
            swap(a, b);
            int nums=13;
            int ans=~nums;
        System.out.println(ans);
    }

    public static void swap(int a, int b){
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a+"  "+b);
    }
}

