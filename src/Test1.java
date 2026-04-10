class MathUtil {
    static int add(int a, int b) {
        return a + b;
    }

    static int square(int x) {
        return x * x;
    }
}

public class Test1 {
     public static void main(String[] args) {
        System.out.println(MathUtil.add(5, 3));
        System.out.println(MathUtil.square(4));
    }
}
