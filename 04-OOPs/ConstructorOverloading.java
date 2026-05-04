public class ConstructorOverloading {
    int id;
    String name;

    public ConstructorOverloading() {
        id = 0;
        name = "Unknown";
    }

    public ConstructorOverloading(int id) {
        this.id = id;
        this.name = "Unknown";
    }

    public ConstructorOverloading(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        ConstructorOverloading p1 = new ConstructorOverloading();
        ConstructorOverloading p2 = new ConstructorOverloading(1);
        ConstructorOverloading p3 = new ConstructorOverloading(2, "Bob");
        
        System.out.println("p1: " + p1.id + ", " + p1.name);
        System.out.println("p2: " + p2.id + ", " + p2.name);
        System.out.println("p3: " + p3.id + ", " + p3.name);
    }
}
