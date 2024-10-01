package DSA100Challenge;

public class LinearSearchInJava {
    public static void main(String args[]){
        int arr[]={10,20,30,40,50};
        int target=30;
        int result=linerserach(arr,target);
        if(result != -1){
            System.out.println("Element found at  Index :"+result);
        }
        else{
            System.out.println("Element not foud");
        }
    }

    private static int linerserach(int[] arr, int target) {
        for(int i=0; i<=arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

}
