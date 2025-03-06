package StringAllJavaProgram2025;

public class ArraySIze {

        public static void main(String[] args) {
            int[] arr = new int[10000]; // 10000 size की array बनाना
            arr[0] = 5; // पहले index पर 5 डालना
            arr[9999] = 10; // आखिरी index पर 10 डालना

            System.out.println(arr[0]); // Output: 5
            System.out.println(arr[9999]); // Output: 10
            System.out.println(arr[5000]); // Output: 0 (default value)
        }
    }


