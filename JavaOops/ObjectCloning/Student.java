package JavaOops.ObjectCloning;

public class Student implements  Cloneable {
    int rollnumber;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
