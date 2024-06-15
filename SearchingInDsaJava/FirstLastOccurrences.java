package SearchingInDsaJava;

public class FirstLastOccurrences {
    public static void main(String[] args) {
        int arr[]={0,1,1,5};
        int k=1;
        firstLastOccurrence(arr, k);
    }
    private static void firstLastOccurrence(int arr[],int k){
        int first=-1;
        int last=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==k){
                if(first==-1){
                    first=i;
                }
                last=i;
            }
        }

            System.out.print("First occurence of " + k + " is " + first + " and last occurence is " + last);
        }
    }

