import java.util.Scanner;

public class String13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!Character.isLetterOrDigit(ch) && ch != ' ') {
                count++;
            }
        }

        System.out.println("Special characters: " + count);
    }
}