package ArraysProgram;

public class printDuplicateElementArrys {
    public static void main(String []args){
        int arr[]={10,30,30,40,60,50,50,60};
        for(int i=0; i<arr.length; i++){
            for(int j=1+i; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]);
                }
            }
        }
    }
}
