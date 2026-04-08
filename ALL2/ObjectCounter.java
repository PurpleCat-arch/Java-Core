public class ObjectCounter {
    static int count = 0;

    ObjectCounter() {
        count++;
    }

    public static void main(String[] args) {
        ObjectCounter obj1 = new ObjectCounter();
        ObjectCounter obj2 = new ObjectCounter();
        ObjectCounter obj3 = new ObjectCounter();

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);

        System.out.println("Objects created: " + count);
    }
}
