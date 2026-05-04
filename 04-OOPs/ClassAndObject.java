public class ClassAndObject {
    String name;
    int age;

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        ClassAndObject obj = new ClassAndObject();
        obj.name = "Alice";
        obj.age = 25;
        obj.display();
    }
}
