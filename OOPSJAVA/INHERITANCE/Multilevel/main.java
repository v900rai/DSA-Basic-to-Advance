package OOPSJAVA.INHERITANCE.Multilevel;

public class main {
    public static void main(String[] args) {
        son s=new son();
        s.cycle();
        s.car();
    }

}
class Dadaji{
    void scooter(){
        System.out.println(" dada ji ");
    }
}
class papa extends Dadaji{
    void car(){
        System.out.println(" papa ji ");
    }
}
class son extends papa{
    void cycle(){
        System.out.println("beta ji ka sub h");
    }
}
