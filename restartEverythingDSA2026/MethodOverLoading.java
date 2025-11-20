package restartEverythingDSA2026;
 class Demo{
     void show(int a){
         System.out.println("Integer a" +a);

     }

     void show(String s){
         System.out.println("String s" + s);
     }
 }
public class MethodOverLoading {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.show(10);
        d.show("vishal rai");
    }


}
