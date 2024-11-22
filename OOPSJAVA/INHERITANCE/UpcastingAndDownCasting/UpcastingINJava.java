package OOPSJAVA.INHERITANCE.UpcastingAndDownCasting;

public class UpcastingINJava {
    public static void main(String[] args) {
        parent p=new chield();
        p.show();//upcasting h bhai log ye
        //widennig bhi bolte h


    }
}
class parent {
    void show(){
        System.out.println("parent class ");
    }
}
class chield extends parent{
    void wow(){
        System.out.println("child class  ");
    }
}
