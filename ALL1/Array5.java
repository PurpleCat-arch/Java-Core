public class Array5 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        arr[3] = 5;

        int size =4;
        int pos =2;
        int value = 3;

        for (int i=size ; i>pos;i--){
            arr[i] = arr[i-1];
        }
        arr[pos] = value;
        size++;


        for (int i = 0; i < size; i++){
        System.out.print(arr[i] + " ");
        }
    }
}
