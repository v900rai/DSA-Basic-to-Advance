package selfpractices.InterviewOnly;

public class ArraysHowManyTimes {
    public static void main(String []args){
        int arr[] ={10,20,20,30,40,50};
        System.out.println(arr);
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==20){
                count++;
            }
        }
        System.out.println("value 20 repeating "+count);
    }
}
