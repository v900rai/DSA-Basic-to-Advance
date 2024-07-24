package AdvancedDataStructureInJava;

public class MajoritElements {
    public static int majorityElement(int num[] ){
        int candidate=0;
        int count=0;
        for(int i = 0; i<num.length; i++){
            if(count ==0){
                candidate=num[i];

            }
            if(candidate==num[i]){
                count++;
            }
            else {
                count--;
            }

        }
        return candidate;

    }

    public static void main(String[] args) {
        int arr[]={1,2,2,2,1};
        System.out.println(majorityElement(arr));
    }

}
