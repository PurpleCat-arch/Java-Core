public class Throw {
    static void fun(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied");
        } else {
            System.out.println("Access granted");
        }
    }
    public static void main(String[] args) {
        fun(18);
        System.out.println("rest of the code...");
    }
}