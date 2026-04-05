import java.util.Scanner;

public class String5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String str = sc.nextLine();

        int words = 1;

        for (int i = 0; i < str.toCharArray().length; i++) {
            if (str.toCharArray()[i] == ' ')
                words++;
        }

        System.out.println("Word count: " + words);
    }
}