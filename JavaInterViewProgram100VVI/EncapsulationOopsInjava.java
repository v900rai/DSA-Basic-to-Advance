package JavaInterViewProgram100VVI;

public class EncapsulationOopsInjava {
    private String name;

    //Getter
    public String getName() {
        return name;
    }

    // setter
    private void setName(String newname) {
        this.name = newname;
    }

    public static void main(String[] args) {

        EncapsulationOopsInjava encapsulation=new EncapsulationOopsInjava();
        encapsulation.setName("Dinga");
        encapsulation.setName("vishal");
        encapsulation.setName("vipul ");

        System.out.println(encapsulation.getName());
        System.out.println(encapsulation.getName());
        System.out.println(encapsulation.getName());


    }
}
