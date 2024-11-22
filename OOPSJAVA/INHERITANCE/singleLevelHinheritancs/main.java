package OOPSJAVA.INHERITANCE.singleLevelHinheritancs;

class parent {
    void bike(){
        System.out.println("parent class .. bike");
    }
}
class child extends parent{
    void cycle(){
        System.out.println(" child class .. cycle");
    }
}
public class main{
    public static void main(String[] args) {
        child ch=new child();
        ch.bike();
        ch.cycle();

    }
}

