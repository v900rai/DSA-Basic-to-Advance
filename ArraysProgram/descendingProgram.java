package ArraysProgram;

import java.util.Arrays;

public class descendingProgram {
    public static void main(String []args){
        int a[]={ 1,5,8,3,2,9,7,0};
        for(int i=0; i<a.length; i++){
            for(int j=1+i; j<a.length; j++){
                if(a[i]<a[j]){
                    int temp =a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
