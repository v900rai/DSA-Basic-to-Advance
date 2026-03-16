package restartEverythingDSAMarch2026;


class Engine {
    public void start() {
        System.out.println("Engine started");
    }
}

class Car {
    // Direct dependency
    private Engine engine = new Engine();

    public void drive() {
        engine.start();
        System.out.println("Car is moving");
    }
}

public class  TightCoupling {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
    }
}