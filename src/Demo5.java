class Parent {
    void show() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child method");
    }
}
public class Demo5 {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();

        p.show();
        c.show();
    }

}
