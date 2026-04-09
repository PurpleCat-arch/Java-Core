public class Student1 {
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static void main(String[] args) {
        Student1 s = new Student1();
        s.setId(101);
        System.out.println("ID: " + s.getId());
    }
}
