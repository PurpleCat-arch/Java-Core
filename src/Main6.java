class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
public class Main6 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound(); // Calls the overridden method in Dog
    }
}
