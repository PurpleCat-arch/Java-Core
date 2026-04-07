public class Demo1 {
    int x;

    Demo1() {
        x=0;
        System.out.println("Default Constructor");
    }

    Demo1(int x) {
        this.x = x;
        System.out.println("Parameterized Constructor");
    }
    public static void main(String[] args) {
        Demo1 d1 = new Demo1();
        System.out.println("Value of x in d1: " + d1.x);
        Demo1 d2 = new Demo1(10);
        System.out.println("Value of x in d2: " + d2.x);
    }
}
