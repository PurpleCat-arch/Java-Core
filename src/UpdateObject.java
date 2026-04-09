public class UpdateObject {
    int value;

    void update(int newValue) {
        value = newValue;
    }

    public static void main(String[] args) {
        UpdateObject obj = new UpdateObject();
        obj.update(50);
        System.out.println(obj.value);
    }
}
