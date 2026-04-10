public class Static4 {
    static int count = 0;

    Static4() {
        count++;
    }

    public static void main(String[] args) {
        Static4 obj1 = new Static4();
        Static4 obj2 = new Static4();
        Static4 obj3 = new Static4();

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);

        System.out.println("Objects created: " + count);
    }
}
