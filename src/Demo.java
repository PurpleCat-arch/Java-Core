public class Demo{
    public static void main(String[] args){
        try {
            @SuppressWarnings("unused")
            int data  = 100 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}