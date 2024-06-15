package selfpractices;

abstract class animal {
    animal(){
        System.out.println("All animals...!");
    }
    public abstract void sound();

}
class Doge extends animal{
    Doge(){
        super();
    }
    public void sound(){
        System.out.println("Doge is Barkking");
    }

}
class Lion extends animal{
    Lion(){
        super();
    }
    public void sound(){
        System.out.println("Lion is Roar");
    }
}
class Test{
    public static void main(String[] args) {
        Doge d=new Doge();
        Lion l=new Lion();
        d.sound();
        l.sound();
    }
}
