package December2024;

abstract class Vehicle {
    void start(){

    }
}
class Car extends Vehicle{
    void start(){
        System.out.println(" car start with key ");
    }
}
class Scooter extends Vehicle{

    void start() {
        System.out.println(" Scooter start with kick  ");
    }

    public static void main(String[] args) {
       // Vehicle v=new Vehicle();
        Car car=new Car();
        car.start();
        Scooter scooter=new Scooter();
        scooter.start();

    }
}
