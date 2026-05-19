package multithreading2026;

public class Hello {
    public static void main(String []args){
        MyThread t1 = new MyThread();
        t1.start();

    }

}
// using thread class
class MyThread extends  Thread{
    @Override
    public void run(){
        System.out.println("Thread is running");
    }
}
