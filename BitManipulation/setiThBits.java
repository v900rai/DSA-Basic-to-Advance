package BitManipulation;

public class setiThBits {
    public static void main(String[] args) {
        int n=11;
        int i=2;
        setBit(n,i);
    }
    public static void setBit(int n, int i){
        int mask=1<<i;
        int ans=n|mask;
        System.out.println(ans);

    }
}
