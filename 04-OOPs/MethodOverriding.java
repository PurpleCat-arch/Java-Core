class Parent {
    void display() {
        System.out.println("This is the parent class.");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("This is the child class overriding parent method.");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        obj1.display();

        Child obj2 = new Child();
        obj2.display();
        
        Parent obj3 = new Child();
        obj3.display();
    }
}
