abstract class AnimalAbstract {
    abstract void sound(); // Abstract method (no body)

    void sleep() { // Regular method
        System.out.println("Zzz...");
    }
}

class Cat extends AnimalAbstract {
    void sound() {
        System.out.println("Meow");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.sound();
        myCat.sleep();
    }
}
