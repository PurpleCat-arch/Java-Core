import java.util.Scanner;

public class String7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        System.out.print("Enter character to replace: ");
        char oldChar = sc.next().charAt(0);

        System.out.print("Enter new character: ");
        char newChar = sc.next().charAt(0);

        String result = "";

        for (int i = 0; i < str.toCharArray().length; i++) {
            if (str.toCharArray()[i] == oldChar)
                result += newChar;
            else
                result += str.toCharArray()[i];
        }

        System.out.println("Updated string: " + result);
    }
}