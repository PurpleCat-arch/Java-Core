import java.util.Scanner;
public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        switch(day){
            case "saturday","sunday":
                System.out.println("Alarm at 6AM");
                break;
            case "monday":
                System.out.println("Alarm at 7AM");
                break;
            default:
                System.out.println("Alarm at 8AM");
        }
    }
}
