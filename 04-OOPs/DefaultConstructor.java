public class DefaultConstructor {
    String message;

    public DefaultConstructor() {
        message = "Default constructor invoked!";
    }

    public static void main(String[] args) {
        DefaultConstructor obj = new DefaultConstructor();
        System.out.println(obj.message);
    }
}
