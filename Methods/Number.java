package Methods;

public class Number {
    private int  a=10;
    private int  b=20;
    public  void sum(){
        System.out.println(a+b);
    }
    public void sub(){
        System.out.println(a-b);
    }

    public static void main(String[] args) {
        Number num=new Number();
        num.sum();
        num.sub();
    }
}
