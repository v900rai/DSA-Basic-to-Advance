package July2024;

public class printNos10TO9 {
    public static void main(String args[]){
        int n=10;
        revers(n);


    }
    public static void revers(int n){
        if (n > 0) {
            System.out.print(n + " ");
            revers(n - 1);
        }
        return;
    }

}
