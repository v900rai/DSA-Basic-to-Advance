package Methods;

public class TwoPointerApporachInJava {
    public static void main(String[] args)
    {
        // Declaring and initializing array
        int arr[] = { 2, 3, 5, 8, 9, 10, 11 };

        int val = 30;

        System.out.println(isPairSum(arr, arr.length, val));
    }
    //
    private static int isPairSum(int A[], int N,int X){
        for(int i=0; i<N; i++){
            for(int j=1+1; j<N; j++){
                if(i==j){
                    continue;
                }
                if(A[i]+A[j]==X){
                    return 1;
                }
                if(A[i]+A[j]>X){
                    break;
                }

            }
        }
        return 0;

    }
}
