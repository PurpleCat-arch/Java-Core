
class Studs{
    String name;
    int id;
    void display(){
        System.out.println(name+" : "+id);
    }
}

public class Student{
    public static void main(String[] args){
        Studs s1 = new Studs();
        Studs s2 = new Studs();
        s1.name= "PinkCat";
        s1.id=246;
        s2.name="PinkDog";
        s2.id=183;
        s1.display();
        s2.display();

    }
}