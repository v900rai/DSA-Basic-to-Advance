package Interview2025DSA;

public class HowToUseSplit {

    public static void main(String args[]){
        String data = "Apple,Banana,Mango,Orange";
        String[] fruits = data.split(","); // comma ke basis par split

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
