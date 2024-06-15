package String;

public class StringToInteger {
    public static void main(String []args){
        String str="12345";
        int result=Integer.parseInt(str);

       // int result = Integer.parseInt(str); // using Integer.parseInt()
        // int result2 = Integer.valueOf(str); //using Integer.valueOf()

        System.out.println(" converted to the String "+result);
    }
}
