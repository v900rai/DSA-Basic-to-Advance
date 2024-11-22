package OOPSJAVA.INHERITANCE.singleLevelHinheritancs.student;


interface Printable{
    void print();
}
interface Showable{
    void show();
}
interface vishal{
    void run();
}
class A7 implements Printable,Showable ,vishal{
    public void print(){System.out.println("Hello");}
    public void show(){System.out.println("Welcome");}
    public void run(){
        System.out.println("vishal rai");
    }

    public static void main(String args[]){
        A7 obj = new A7();
        obj.print();
        obj.show();
        obj.run();
    }
}
