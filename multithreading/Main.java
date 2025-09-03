package multithreading;
class MyThread extends Thread {
    public void run() {
        // run() method में वो code लिखो
        // जो thread execute करेगा
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread running: " + i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread(); // नया thread object
        t1.start(); // start() call करने से नया thread शुरू होगा
    }
}
