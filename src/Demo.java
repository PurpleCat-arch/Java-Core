public class Demo {
    public static void main(String[] args) {
        try {
            int data =10/0;
            System.out.println(data);
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }
        finally {
            System.out.println("finally block is always executed");
        }
        System.out.println("rest of the code...");
        
    }
}
