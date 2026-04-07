public class car1 {
    String brand;
    int speed;

    void display() {
        System.out.println(brand + " " + speed);
    }

    public static void main(String[] args) {
        car1 c1 = new car1();
        c1.brand = "BMW";
        c1.speed = 200;
        c1.display();

        car1 c2 = new car1();
        c2.brand = "Audi";
        c2.speed = 180;
        c2.display();
    }
}
