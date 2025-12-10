package restartEverythingDSA2026;

public class MethodsFirst {
    static int  a =10;
    int b = 20;

    public static void main(String[] args) {

        MethodsFirst m = new MethodsFirst();
        m.Disp();

        MethodsFirst.Show();

    }
    static void Show(){
        System.out.println(a +" only access static variable");
    }
    void Disp(){
        System.out.println(b +"non_static " + a + "static variables"+"You can access Both ");
    }

}
