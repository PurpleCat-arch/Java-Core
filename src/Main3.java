class Animal1 {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog1 extends Animal1 {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Puppy extends Dog1 {
    void weep() {
        System.out.println("Puppy weeps");
    }
}
public class Main3 {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.eat(); // Inherited from Animal
        puppy.bark(); // Inherited from Dog
        puppy.weep(); // Specific to Puppy
    }
}
