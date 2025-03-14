package ArraysInterviewPeoblem2025;


import java.util.ArrayList;
import java.util.List;
public class FizzBuzz {
    // Java program for Fizz Buzz Problem
// by checking every integer individually




        static ArrayList<String> fizzBuzz(int n){

            ArrayList<String> res = new ArrayList<>();

            for (int i = 1; i <= n; ++i) {

                // Check if i is divisible by both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {

                    // Add "FizzBuzz" to the result list
                    res.add("FizzBuzz");
                }

                // Check if i is divisible by 3
                else if (i % 3 == 0) {

                    // Add "Fizz" to the result list
                    res.add("Fizz");
                }

                // Check if i is divisible by 5
                else if (i % 5 == 0) {

                    // Add "Buzz" to the result list
                    res.add("Buzz");
                }
                else {

                    // Add the current number as a string to the
                    // result list
                    res.add(Integer.toString(i));
                }
            }

            return res;
        }

        public static void main(String[] args){
            int n = 20;
            ArrayList<String> res = fizzBuzz(n);
            for (String s : res) {
                System.out.print(s + " ");
            }
        }
    }


