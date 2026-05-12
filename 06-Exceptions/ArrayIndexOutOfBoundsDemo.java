public class ArrayIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        int[] indices = {0, 2, 5, -1, 4};
        for (int idx : indices) {
            try {
                System.out.println("Element at index " + idx + ": " + numbers[idx]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid index " + idx + ": " + e.getMessage());
            }
        }
    }
}
