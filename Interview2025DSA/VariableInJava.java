package Interview2025DSA;

public class VariableInJava {
    int a=20; //instance variable
    static int  b=30; //static variable

    public static void main(String[] args) {
        int c=50; // local variable
        System.out.println(c+" local variable ");
        System.out.println(VariableInJava.b+" static variable ");
        VariableInJava ref=new VariableInJava();
        System.out.println(ref.a+" instance variable in java ");

    }

}
