package Binaryyyyy;

public class BinaryToDecimal {
    public static int binaryToDecimal(int nums){
        int temp=nums;
        int base=1;
        int decimal_value=0;
        while(temp>0){
            int last_digit=nums%10;
            decimal_value=decimal_value+last_digit*base;
            //0=0+1+1
            base=base*2;
        }
        return decimal_value;
    }
    public static void main(String args[]){
        int nums=1010;
        System.out.println(binaryToDecimal(nums));
    }
}
