class Vehicle {
    int speed = 60;

    void display() {
        System.out.println("Speed: " + speed);
    }
}

class Car extends Vehicle {
    String brand = "Toyota";

    void show() {
        System.out.println("Brand: " + brand);
    }
}

public class Main10 {
    public static void main(String[] args) {
        Car c = new Car();
        c.display(); // Inherited from Vehicle
        c.show();    // Defined in Car
    }
}
