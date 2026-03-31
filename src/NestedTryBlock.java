public class NestedTryBlock {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            System.out.println(a[5]);
            try {
                int x = 10 / 0; 
            } 
            catch (ArithmeticException e) {
                System.out.println("Not Possible");
            }
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds");
        }
        System.out.println("Rest of the code...");
    }
}