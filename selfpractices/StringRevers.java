package selfpractices;

public class StringRevers {
    public static void main(String [] args){
        String str="Vishal rai";
        int len=str.length();
        StringBuilder sb=new StringBuilder(len);
        for (int i=len-1; i>0; i--){
            sb.append(str.charAt(i));

        }
        System.out.println(sb);
    }
}
