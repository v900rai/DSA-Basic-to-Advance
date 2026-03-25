package restartEverythingDSAMarch2026;



class Singleton {

   /* // 1. static variable (object store karega)
    private static Singleton obj;

    // 2. private constructor (bahar se new nahi kar sakte)
    private Singleton() {
        System.out.println("Object created");
    }
    // 3. method jo object return karega
    public static Singleton getInstance() {

        if (obj == null) {           // pehli baar
            obj = new Singleton();   // object create
        }

        return obj; // same object return
    }*/
    private static Singleton boj;
    private Singleton(){
        System.out.println("Object has been created ony one object ");
    }
    public static Singleton getInstance(){
        if(boj == null){
            boj = new Singleton();
        }
        return boj;
    }

    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        System.out.println(s1 == s2);
    }
}