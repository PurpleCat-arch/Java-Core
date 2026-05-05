class Shape {
    void display() {
        System.out.println("This is a shape.");
    }
}

class Polygon extends Shape {
    void sides() {
        System.out.println("A polygon has multiple sides.");
    }
}

class Rectangle extends Polygon {
    void calculateArea() {
        System.out.println("Area = length * width");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.display();
        rect.sides();
        rect.calculateArea();
    }
}
