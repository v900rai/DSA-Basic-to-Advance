package AdvancedDataStructureInJava;

import java.security.spec.RSAOtherPrimeInfo;

import static selfpractices.printLeaders.printLeaders;


public class PrintLeaderArrays {

    public PrintLeaderArrays(){

    }
    public static void main(String[] args){

        //LeadersInArray lead = new LeadersInArray();
        PrintLeaderArrays prl = new PrintLeaderArrays();
        int[] arr = new int[]{16, 17, 4, 3, 5, 2};
        int n = arr.length;
      //  iprintLeaders(arr, n);
        prl.printLeader(arr,n);

    }
/*   void printLeader(int[] arr, int size){
        for(int i= 0; i<size; i++){
            int j;
            for( j=i+1; j<size; j++){
                if(arr[i]<=arr[j]){
                    break;
                }
              if(j == size){
                  System.out.print(arr[i] + " ");
              }
            }
        }
    }*/

    void printLeader(int[] arr, int size)
    {
        for (int i = 0; i < size; i++)
        {
            int j;
            for (j = i + 1; j < size; j++)
            {
                if (arr[i] <=arr[j])
                    break;
            }
            if (j == size) // the loop didn't break
                System.out.print(arr[i] + " ");
        }
    }
}
