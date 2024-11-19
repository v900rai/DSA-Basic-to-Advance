package Constructors;

public class CopyConstructor {
     String name;
     int id;
    CopyConstructor(String name, int id){
        this.name=name;
        this.id=id;
    }
    CopyConstructor(CopyConstructor copy){
        this.name=copy.name;
        this.id=copy.id;
    }
}
class copppp {
    public static void main(String[] args) {
        // This would invoke the parameterized constructor.
        System.out.println("First Object");
        CopyConstructor geek1= new  CopyConstructor("Avinash", 68);
        System.out.println("GeekName :" + geek1.name
                + " and GeekId :" + geek1.id);

        System.out.println();

        // This would invoke the copy constructor.
        CopyConstructor geek2 = new  CopyConstructor(geek1);
        System.out.println(
                "Copy Constructor used Second Object");
        System.out.println("GeekName :" + geek2.name
                + " and GeekId :" + geek2.id);
    }
}