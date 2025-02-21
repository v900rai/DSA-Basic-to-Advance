package ClasseAndObject;

import java.security.spec.RSAOtherPrimeInfo;

public class Car {
    int year;
    String name;

    public void show() {
        System.out.println("Car is Running ");
    }

    public static void main(String[] args) {
        Car cr = new Car();
        System.out.println("Car " + cr.name + " " + cr.year);
        cr.year = 1992;
        cr.name = "BMW";
        cr.show();

        System.out.println("Year " + cr.year + "Name " + cr.name);
    }

}
