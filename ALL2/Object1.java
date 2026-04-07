public class Object1 {
    int id;
    String name;

    Object1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Object1 obj1 = new Object1(1, "purple cat");
        Object1 obj2 = new Object1(1, "purple cat");

        if (obj1.id == obj2.id && obj1.name.equals(obj2.name)) {
            System.out.println("obj1 and obj2 are equal.");
        } else {
            System.out.println("obj1 and obj2 are not equal.");
        }

    }
}
