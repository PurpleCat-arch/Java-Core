public class NegativeArraySizeDemo {
    public static void main(String[] args) {
        int[] sizes = {5, 0, -3, 10, -1};

        for (int size : sizes) {
            try {
                int[] arr = new int[size];
                System.out.println("Created array of size " + size + " successfully.");
            } catch (NegativeArraySizeException e) {
                System.out.println("Cannot create array of size " + size + ": " + e);
            }
        }
    }
}
