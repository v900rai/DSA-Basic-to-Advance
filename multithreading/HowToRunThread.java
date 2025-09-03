package multithreading;


    class mythread extends Thread {
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " → " + i);
            }
        }
    }

    public class HowToRunThread{
    public static void main(String[] args) {
        mythread t1 =new mythread();
        mythread t2 =new mythread();

            t1.setName("Thread-1");
            t2.setName("Thread-2");

            t1.start();
            t2.start();
        }
    }


