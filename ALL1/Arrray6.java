public class Arrray6 {
    public static void main (String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        int size = arr.length;

        int pos = 2;

        for (int i = pos; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        size--;

        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }
}
