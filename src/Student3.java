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
    String calGrade(){
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
}
public class Student3 {
    public static void main(String[] args) {
    }
}