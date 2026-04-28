package string2026;

class Singleton {

    // same class ka ek static object
    private static Singleton obj = new Singleton();

    // private constructor
    private Singleton() {

    }

    // object return karne ke liye method
    public static Singleton getInstance() {
        return obj;
    }

    public void show() {
        System.out.println("Singleton Class Example");
    }

    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        s1.show();

        System.out.println(s1 == s2);
    }
}