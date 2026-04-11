
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        super.sound(); // calling parent method
        System.out.println("Dog barks");
    }
}
public class Main7 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
