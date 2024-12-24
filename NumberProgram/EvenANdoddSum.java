package NumberProgram;



public class EvenANdoddSum {
   /* public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2; i<n; i++){
            if(n/i==0){
                return false;
            }
            else{
              return true;
            }

    }*/
    // Java program to find out
// Sum of elements at even and
// odd index positions separately



        public static void main(String args[]) {
            int arr[] = {1, 2, 3, 4, 5, 6};
            int even = 0, odd = 0;

            // Loop to find even, odd sum
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 0)
                    even += arr[i];
                else
                    odd += arr[i];
            }

            System.out.println("Even index positions sum: " + even);
            System.out.println("Odd index positions sum: " + odd);
        }
    }



