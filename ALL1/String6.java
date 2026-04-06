import java.util.Scanner;
public class String6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        String result ="";

        for(int i=0;i<str.toCharArray().length;i++){
            if (str.toCharArray()[i] != ' ')
                result += str.toCharArray()[i];
        }
        System.out.println("Without spaces: " + result);
    }
}
