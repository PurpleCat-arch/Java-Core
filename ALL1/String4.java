import java.util.Scanner;

public class String4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        String rev = "";

        for (int i = str.toCharArray().length - 1; i >= 0; i--) {
            rev += str.toCharArray()[i];
        }

        System.out.println("Reversed: " + rev);
    }
}