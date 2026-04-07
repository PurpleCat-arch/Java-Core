public class Circle {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void circumference() {
        System.out.println("Circumference: " + (2 * 3.14 * radius));
    }

    public static void main(String[] args) {
        Circle c = new Circle(7);
        c.circumference();
    }
}
