package NumberProgram;

public class JavaSwapWithTwoVars {
    public static void main(String []args){
        int a=10, b=20;
        System.out.println("Before swapping");
        System.out.println("value of a="+a);
        System.out.println("value of b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("---------------------------");
        System.out.println("After swapping");
        System.out.println("value of a="+a);
        System.out.println("value of b="+b);
    }
    }

