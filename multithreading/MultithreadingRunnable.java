package multithreading;
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable Thread running: " + i);
        }
    }
}

public class MultithreadingRunnable{
public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread t1 = new Thread(myRunnable); // Runnable को thread में wrap किया
        t1.start(); // Thread start किया
    }
}
