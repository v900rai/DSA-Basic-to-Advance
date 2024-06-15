package challengeInterfacOrAbstract;

public class TestShape {
    public static void main(String[] args) {
       // Shape shape=new Shape() {
         Circle circle=new Circle(5);
         Square square=new Square(10.3);
         System.out.println("Area of  circle %f\n" + circle.calculateArea());
        System.out.println("Area of  square of  %f\n" + circle.calculateArea());

        }
    }

