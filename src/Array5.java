import java.util.Scanner;
public class Array5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = {10,20,30,40,50};

        System.out.println("Enter the Element: ");
        int key = sc.nextInt();
        boolean found =false;

        for (int num:arr) {
            if (num== key) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Element found in the array.");
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
