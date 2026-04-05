public class Array9 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 10, 6, 4, 8, 1};

        int min = arr[0];
        int maxDiff = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - min > maxDiff) {
                maxDiff = arr[i] - min;
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Max Difference = " + maxDiff);
    }
}