public class CopyConstructor {
    int id;
    String name;

    public CopyConstructor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    CopyConstructor(CopyConstructor obj) {
        this.id = obj.id;
        this.name = obj.name;
    }
    void display() {
        System.out.println(id + " " + name);
    }
    public static void main(String[] args) {
        CopyConstructor obj1 = new CopyConstructor(1, "purple cat");
        CopyConstructor obj2 = new CopyConstructor(obj1);
        obj1.display();
        obj2.display();
    }
}
