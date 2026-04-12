class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        super.sound(); // parent method
        System.out.println("Dog barks");
    }
}
public class Demo8 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
