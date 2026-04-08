public class ArrayConstructor {
    int[] arr;

    public ArrayConstructor(int size) {
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i + 1; // Initialize with values 1 to size
        }
    }

    public void display() {
        System.out.print("Array elements: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayConstructor arrayObj = new ArrayConstructor(5);
        arrayObj.display();
    }
}
