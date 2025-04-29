package SearchingAlgorithms;

public class FirstRepeatingCharater {
    public static void main(String[] args) {

        // Initializing an array and its size
        int[] arr = {10, 5, 3, 4, 3, 5, 6};
        int n = arr.length;
        int result=firstReapting(arr, n);
        if(result==-1){
            System.out.println("No repeating element found!");
        }
        else {
            System.out.println("First repeating element is " + arr[result]);
        }
    }

    public static int firstReapting(int[] arr, int n) {
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    return i;
                }
            }
        }
        // If no repeating element is found, return -1
        return -1;

    }

}

