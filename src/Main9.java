class Animal {
    Animal(String type) {
        System.out.println("Type: " + type);
    }
}

class Dog extends Animal {
    Dog() {
        super("Mammal"); // calling parent constructor
        System.out.println("Dog created");
    }
}
public class Main9 {
    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println(d);
    }
}
