package restartEverythingDSA2026;


    class Counter {
        static int count = 0;
        // English: shared by all objects
        // Hindi: sabhi objects ke liye common

        Counter() {
            count++;          // increases for every object
        }
    }

public class TestCount {
        public static void main(String[] args) {
            new Counter();
            new Counter();
            new Counter();

            System.out.println(Counter.count); // 3
        }
    }


