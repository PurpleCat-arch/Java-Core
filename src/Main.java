import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        if (marks>=35){
            if (marks>=90){
                System.out.println("Grade A");
            }
            else if (marks>=85){
                System.out.println("Grade B");
            }
            else{
                System.out.println("Grade C");
            }
        }
        else{
            System.out.println("Fail");
        }
    }
}
