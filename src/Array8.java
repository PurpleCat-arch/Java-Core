import java.util.Scanner;
public class Array8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {5,10,15,20};

        System.out.println("Enter the elements: ");
        int key = sc.nextInt();

        int index = -1;

        for(int i=0; i<arr.length;i++) {
            if(arr[i] ==key){
                index=i;
                break;
            }
        }
        if(index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
