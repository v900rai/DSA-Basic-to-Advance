package JavaOops.ObjectCloning;

public class HowToCreate {
    private static String name;

    public static void main(String args[]){
        HowToCreate name=new HowToCreate();
        // assigning member some value
        HowToCreate.name = "Rahul";

        System.out.println("student1.name: " + HowToCreate.name);
    }
}
