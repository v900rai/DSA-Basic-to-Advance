package CollectionsFramework;
class Runnablelll implements Runnable{
   public void run(){
       System.out.println("i am thread  111 not a threat");

       System.out.println("i am thread  111 not a threat");
       System.out.println("i am thread  111 not a threat");
       System.out.println("i am thread  111 not a threat");



   }




}
class Runnablell implements Runnable {
    public void run() {
        System.out.println("i am thread  222 not a threat");
        System.out.println("i am thread  222 not a threat");
        System.out.println("i am thread  222 not a threat");

    }
}

public class RunnableInterface {
    public static void main(String[] args) {

        Runnablell bullete1=new Runnablell();
        Runnablelll bullete2=new Runnablelll();
        Thread gun1=new Thread(bullete1);
        Thread gun2=new Thread(bullete2);
        gun1.start();
        gun2.start();

    }

    }

