public class Immutable {
    private final int id;
    private final String name;

    Immutable(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public static void main(String[] args) {
        Immutable obj = new Immutable(1, "Immutable Object");
        System.out.println("ID: " + obj.getId());
        System.out.println("Name: " + obj.getName());
    }
}
