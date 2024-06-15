package String;

public class countCharacter {
    public static void main(String []args){
        String str =" hello vishal rai what are u doing ";
        int count=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)!=' ')
                count++;



        }
        //Displays the total number of characters present in the given string
        System.out.println("Total number of characters in a string: " + count);
    }
}
