public class Constructor2 {
    private Constructor2() {
        System.out.println("Constructor2");
    }
    public static void object() {
        Constructor2 c = new Constructor2();
    }
    public static void main(String[] args) {
        Constructor2.object();
    }
}
