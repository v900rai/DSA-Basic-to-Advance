package Methods;

public class ParameterizedConstructor {
    // data members of the class.
    String name;
    int id;

    public ParameterizedConstructor(String avinash, int i) {
    }

    void Geek(String name, int id)
    {
        this.name = name;
        this.id = id;
    }
}
class GFG {
    public static void main(String[] args)
    {
        // This would invoke the parameterized constructor.
        ParameterizedConstructor geek1 = new  ParameterizedConstructor("Avinash", 68);
        System.out.println("GeekName :" + geek1.name
                + " and GeekId :" + geek1.id);
    }
}
