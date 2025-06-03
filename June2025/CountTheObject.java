package June2025;

public class CountTheObject {
    public static int count=0;
    public CountTheObject(){
        count++;
    }
    public static void main (String args[]){
        CountTheObject s1=new CountTheObject();
        CountTheObject s2=new CountTheObject();
        CountTheObject s3=new CountTheObject();
        CountTheObject s4=new CountTheObject();
        System.out.println("Number the total object "+CountTheObject.count);



    }
}
