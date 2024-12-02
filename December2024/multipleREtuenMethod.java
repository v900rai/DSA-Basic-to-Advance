package December2024;

public class multipleREtuenMethod {
    static int myMethod(int x, int y) {
        return x + y;
    }
    static int myMethodd(int x, int y,int z) {
        return x + y + z ;
    }

    public static void main(String[] args) {
        System.out.println(myMethod(5, 3));
        int z=myMethodd(10,20,30);
        System.out.println(z);
    }
    }

