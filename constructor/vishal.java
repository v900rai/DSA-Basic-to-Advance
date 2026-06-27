package constructor;

abstract class TV {
    abstract void turnOn();
    abstract  void turnOf();

}
class TVRemote extends TV{

    @Override
    void turnOn(){
        System.out.println("Tvis turned on");
    }

    @Override
    void turnOf() {
        System.out.println("Tv is turned of");
    }
}
public class vishal{
    public static void main(String[] args) {

     TV remote  = new TVRemote();
     remote.turnOn();
     remote.turnOf();
    }
}
