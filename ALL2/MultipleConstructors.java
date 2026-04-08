public class MultipleConstructors {
    int a;
    String b;

    public MultipleConstructors() {
        a=0;
        b="Default";
    }
    public MultipleConstructors(int a) {
        this.a = a;
        b="Default";
    }
    public MultipleConstructors(String b) {
        a=0;
        this.b = b;
    }
    public MultipleConstructors(int a, String b) {
        this.a = a;
        this.b = b;
    }
    public void display() {
        System.out.println("a: " + a + ", b: " + b);
    }
    public static void main(String[] args) {
        MultipleConstructors obj1 = new MultipleConstructors();
        MultipleConstructors obj2 = new MultipleConstructors(10);
        MultipleConstructors obj3 = new MultipleConstructors("Hello");
        MultipleConstructors obj4 = new MultipleConstructors(20, "World");

        obj1.display();
        obj2.display();
        obj3.display();
        obj4.display();
    }
}
