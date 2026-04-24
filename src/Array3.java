public class Array3 {
    public static void main(String[] args) {
        int[] arr = {30,50,56,87,86,78};

        int max = arr[0];
        int min = arr[0];

        for (int num: arr) {
            if (num>max) {
                max=num;
            }
            if (num<min) {
                min= num;
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
