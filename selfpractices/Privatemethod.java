package selfpractices;

public class Privatemethod {
    private  static int x=5;
    static void f1(){// static h to object create kr raha hu other wish i will not create object
         //i can declared static method then i can access class.name interview  problem
        x=5;
         System.out.println(x);
    }

    public static void main(String[] args) {
      //  Privatemethod p=new Privatemethod();
      Privatemethod.f1();
    }
}
