class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barking");
    }
}

class Puppy extends Dog {
    @Override
    void sound() {
        System.out.println("Puppy cute barking");
    }
}

public class TestMulti {
    public static void main(String[] args) {
        Animal a = new Puppy();
        a.sound();  // Puppy version
    }
}