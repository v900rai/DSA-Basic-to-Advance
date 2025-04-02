package ArraysTop50InterveiwProblemsGFG;

public class CountTheObject {
    private static int count=0;
    public CountTheObject(){
        count++;
    }
    public static int getCountObject(){
        return count;
    }

    public static void main(String[] args) {
        CountTheObject obje1=new CountTheObject();
        CountTheObject obje2=new CountTheObject();
        CountTheObject obje3=new CountTheObject();
        CountTheObject obje4=new CountTheObject();
        CountTheObject obje5=new CountTheObject();
        System.out.println(CountTheObject.getCountObject());

    }
}
