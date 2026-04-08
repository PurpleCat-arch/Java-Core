class Engine {
    void start() {
        System.out.println("Engine started.");
    }
}
public class Car123 {
    Engine engine;

    Car123() {
        this.engine = new Engine();
    }

    void drive() {
        engine.start();
        System.out.println("Car is driving.");
    }
    public static void main(String[] args) {
        Car123 car = new Car123();
        car.drive();   
    }
}
