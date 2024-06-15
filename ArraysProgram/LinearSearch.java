package ArraysProgram;

public class LinearSearch {
    public static void main(String args[]){
        int value=3;
        int arr[]={ 1,3,4,5,9,4,};
        for(int i=0; i<arr.length; i++){
            if(arr[i]==value){
                System.out.println(i);
            }
        }
    }
}
