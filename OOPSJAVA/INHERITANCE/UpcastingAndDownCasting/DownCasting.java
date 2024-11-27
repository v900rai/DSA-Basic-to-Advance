package OOPSJAVA.INHERITANCE.UpcastingAndDownCasting;

public class DownCasting {
    public static void main(String[] args) {
        parentt p= new parentt();


    }
}
class parentt {
    void show(){
        System.out.println("parent class ");
    }
}
class chieldd extends parent{
    void wow(){
        System.out.println("child class  ");
    }

}
