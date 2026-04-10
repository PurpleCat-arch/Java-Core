class Parent1 {
    final void show() {
        System.out.println("Final method");
    }
}

class Child extends Parent1 {
    // void show() {} 
}
public class Parent {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}