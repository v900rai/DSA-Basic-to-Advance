package Interview2025DSA;


interface Vehicle {
    void start();
}

interface Machine {
    void stop();
}
interface Run{
    void walk();
}

class Car implements Vehicle, Machine,Run {
    public void start() {
        System.out.println("Car is starting");
    }

    public void stop() {
        System.out.println("Car is stopping");
    }
    public void walk(){
        System.out.println(" car is Running");
    }

}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start(); // Output: Car is starting
        myCar.stop();  // Output: Car is stopping
        myCar.walk();
    }
}
