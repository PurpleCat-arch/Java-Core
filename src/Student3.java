
import java.util.Scanner;

class Studs3{

    int id;
    String name;
    int age;
    int totmarks;
    int marks1;
    int marks2;

    Studs3(int id, String name, int age, int totmarks, int marks1, int marks2){
        
        this.id=id;
        this.name=name;
        this.age=age;
        this.totmarks=totmarks;
        this.marks1=marks1;
        this.marks2=marks2;

    }
     
    String calGrade() {

        if(totmarks>=90){
            return "A";
        }
        else if(totmarks>=80){
            return "B";
        }
        else if(totmarks>=70){
            return "C";
        }
        else if(totmarks>=60){
            return "D";
        }
        else{
            return "F";
        }

    }

    void display() {
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Total Marks: "+totmarks);
        System.out.println("Marks1: "+marks1);
        System.out.println("Marks2: "+marks2);
        System.out.println("Grade: "+calGrade());
    }
}

public class Student3 {
    static Studs3[] studs = new Studs3[100];
    static int count =0;
    public static void addstudent(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Age: ");
        int age = sc.nextInt();

        System.out.println("Enter Marks1:");
        int marks1 = sc.nextInt();

        System.out.println("Enter Marks2:");
        int marks2 = sc.nextInt();

        System.out.print("Enter Marks: ");
        int totmarks = marks1 + marks2;  

        studs[count++] = new Studs3(id, name, age, totmarks, marks1, marks2);
    
    }

    static void displayStudents() {
        for (int i = 0; i < count; i++) {
            studs[i].display();
        }
    }

    static void searchStudent(int id) {
        for (int i = 0; i < count; i++) {
            if (studs[i].id == id) {
                studs[i].display();
                return;
            }
        }
        System.out.println("Not found");
    }

    static void updateStudent(int id) {
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < count; i++) {
        if (studs[i].id == id) {
           // sc.nextLine();
            System.out.print("New Name: ");
            studs[i].name = sc.nextLine();

            System.out.print("New Marks: ");
            studs[i].totmarks = sc.nextInt();
            return;
        }
    }
    }

    static void deleteStudent(int id) {
    for (int i = 0; i < count; i++) {
        if (studs[i].id == id) {
            for (int j = i; j < count - 1; j++) {
                studs[j] = studs[j + 1];
            }
            count--;
            return;
        }
    }
   }

    public static void main(String[] args) {
    }
}