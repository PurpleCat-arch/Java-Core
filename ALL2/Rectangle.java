public class Rectangle {
    int length, width;

    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    void area() {
        System.out.println("Area: " + (length * width));
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 3);
        r.area();
    }
}
