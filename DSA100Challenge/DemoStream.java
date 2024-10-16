package DSA100Challenge;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DemoStream {
    public static void main(String args[]){
        List<Integer> nums= Arrays.asList(4,5,7,2,3,6);
        System.out.println(nums);
       /* for(int i=0; i<nums.size();i++){
            System.out.println(nums.get(i));

        }*/
       /* for(int n :nums){
            System.out.println(n);
        }
        */
        nums.forEach(n-> System.out.println(n));

        //.....................
       /* int sum=0;
        for(int n:nums){
            if(n%2==0){
                n=n*2;
                sum+=n;
            }
        }
        System.out.println(sum);*/
    }
}
