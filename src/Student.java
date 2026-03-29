class Studs{
    private int marks=28;
    public void msg(){
        System.out.println("study well");
    }
}
public class Student{
    public static void main(String[] args){
        Studs s1 = new Studs();
        System.out.println("Message form parents");
        s1.msg();
    }
}