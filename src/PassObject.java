public class PassObject {
    int value;

    void display(PassObject obj) {
        System.out.println("Value: " + obj.value);
    }

    public static void main(String[] args) {
        PassObject obj = new PassObject();
        obj.value = 200;

        obj.display(obj);
    }
}
