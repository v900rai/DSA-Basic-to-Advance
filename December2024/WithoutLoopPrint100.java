package December2024;

public class WithoutLoopPrint100 {
    public static void main(String[] args) {
printt(1);

    }
    public static void printt(int num){
        if(num<=100){
            System.out.println(num);
            num++;
             printt(num);

        }
    }
}
