package JavaBasicProgramLogicBuilding;

public class Lenght {
    public static void main(String args[]){
        String str = "vishal";
        System.out.println("print the length :" +str.length());
        System.out.println(getLength(str));
    }
    // Method to calculate length of a string
    static int getLength(String s) {
        int cnt = 0;
        for (char c : s.toCharArray()) {
            cnt++;
        }
        return cnt;
    }
}
