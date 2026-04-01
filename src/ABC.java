class Shape{
    void area(){
        System.out.println("area is not defined");
    }
    void area(int side){
        System.out.println("area oa square is "+ side*side);
    }
    void area(int length, int breadth){
        System.out.println("area of rectangle is "+ length*breadth);
    }
}
class Circle extends Shape{
    void area(int radius){
        System.out.println("area of circle is "+ 3.14*radius*radius);
    }
}
public class ABC{
    public static void main(String[] args){
        Shape s = new Shape();
        s.area();
        s.area(5);
        s.area(4, 6);
        Shape c = new Circle();
        c.area(3);
    }
}