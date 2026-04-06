import java.util.Scanner;

public class String12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter main string: ");
        String str = sc.nextLine();

        System.out.print("Enter substring: ");
        String sub = sc.nextLine();

        if (str.contains(sub))
            System.out.println("Substring exists");
        else
            System.out.println("Substring not found");
    }
}