class Display {
    void show(int a) {
        System.out.println(a);
    }

    void show(String a) {
        System.out.println(a);
    }
}
public class Demo7 {
    public static void main(String[] args) {
        Display d = new Display();
        d.show(10);
        d.show("Hello");
    }

}
