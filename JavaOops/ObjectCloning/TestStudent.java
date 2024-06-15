package JavaOops.ObjectCloning;

public class TestStudent {
    public static void main(String[] args) throws CloneNotSupportedException{
        Student obj1=new Student();
        obj1.rollnumber=101;
        Student obj2=(Student) obj1.clone();/// shallow copy independent hota h
        //jo value declared hota h oo hi so hota no change any other value


        obj2.rollnumber=8; ///reference copy approach methods depends upon reference object
        System.out.println(obj1.rollnumber);
        System.out.println(obj2.rollnumber);

    }
}
