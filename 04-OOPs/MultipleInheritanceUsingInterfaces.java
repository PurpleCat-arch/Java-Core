interface Flyer {
    void fly();
}

interface Swimmer {
    void swim();
}

class Duck implements Flyer, Swimmer {
    public void fly() {
        System.out.println("Duck is flying.");
    }
    
    public void swim() {
        System.out.println("Duck is swimming.");
    }
}

public class MultipleInheritanceUsingInterfaces {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.fly();
        duck.swim();
    }
}
