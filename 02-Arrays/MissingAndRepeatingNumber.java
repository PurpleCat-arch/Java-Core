public class MissingAndRepeatingNumber {
    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 2, 1, 1};
        findMissingAndRepeating(arr);
    }

    public static void findMissingAndRepeating(int[] arr) {
        int n = arr.length;
        int repeating = -1;
        int missing = -1;
        
        for (int i = 0; i < n; i++) {
            int absVal = Math.abs(arr[i]);
            if (arr[absVal - 1] > 0) {
                arr[absVal - 1] = -arr[absVal - 1];
            } else {
                repeating = absVal;
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                missing = i + 1;
                break;
            }
        }
        
        System.out.println("Repeating Number: " + repeating);
        System.out.println("Missing Number: " + missing);
    }
}
