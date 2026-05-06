class Bird {
    void sing() {
        System.out.println("Bird is singing");
    }
}

class Parrot extends Bird {
    @Override
    void sing() {
        System.out.println("Parrot is mimicking sounds");
    }
}

class Crow extends Bird {
    @Override
    void sing() {
        System.out.println("Crow is cawing");
    }
}

public class PolymorphismWithReferences {
    public static void main(String[] args) {
        // Parent reference pointing to different child objects
        Bird b1 = new Parrot();
        Bird b2 = new Crow();

        b1.sing(); // Calls Parrot's sing
        b2.sing(); // Calls Crow's sing
    }
}
