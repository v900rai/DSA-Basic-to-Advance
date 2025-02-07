package ArraysInterviewPeoblem2025;

public class ReversString {
    public static  void main(String args[]){
        String str="vishal";
        char ch[]=str.toCharArray();
        for(int i=ch.length-1; i>=0; i--){
            System.out.print(ch[i]+" ,");
        }

    }
}
