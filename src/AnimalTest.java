class Animal {
    void sound() {
        System.out.println("Generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog: Woof Woof ");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat: Meow Meow ");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Animal[] animals = {
            new Dog(),
            new Cat(),
            new Dog()
        };

        for (Animal a : animals) {
            a.sound();  // different outputs
        }
    }
}