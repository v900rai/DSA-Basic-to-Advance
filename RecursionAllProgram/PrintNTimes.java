package RecursionAllProgram;

public class PrintNTimes {
    static void func(int i, int n){

        // Base Condition.
        if(i>n) return;
        System.out.println("Vishal");

        // Function call to print till i increments.
        func(i+1,n);

    }
    public static void main(String[] args) {

        // Here, let’s take the value of n to be 4.
        int n = 5;
        func(1,n);
    }
}
