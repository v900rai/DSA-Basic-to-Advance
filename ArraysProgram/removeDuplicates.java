package ArraysProgram;

public class removeDuplicates {
    public static void main(String []args){
        int arr[]={1,2,2,2,3};
        int ans=removeDuplicateElements(arr , arr.length);
        System.out.println(ans);
    }
    public static int  removeDuplicateElements(int arr[], int n){
        int i=0;
        for(int j=0; j<n; j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
}
