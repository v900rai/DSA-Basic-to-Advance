package selfpractices;

public class StaticAndNonstaticMethosds {

    public static void show(){
        System.out.println("Static block");
    }
    public void display(){
        System.out.println("Non static block will be executed");
    }
    public static void main(String args[]){
        StaticAndNonstaticMethosds s=new StaticAndNonstaticMethosds();
        s.display();
        StaticAndNonstaticMethosds.show();
    }
}
