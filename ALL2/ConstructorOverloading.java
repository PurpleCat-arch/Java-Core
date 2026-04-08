public class ConstructorOverloading {
    ConstructorOverloading() {
        System.out.println("Default Constructor");
    }

    ConstructorOverloading(int x) {
        System.out.println("One parameter: " + x);
    }

    ConstructorOverloading(int x, int y) {
        System.out.println("Two parameters: " + (x + y));
    }

    public static void main(String[] args) {
        ConstructorOverloading obj1 = new ConstructorOverloading();
        ConstructorOverloading obj2 = new ConstructorOverloading(10);
        ConstructorOverloading obj3= new ConstructorOverloading(10, 20);
        
        System.out.println("Constructor overloading allows us to create multiple constructors with different parameters.");
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
    }
}
