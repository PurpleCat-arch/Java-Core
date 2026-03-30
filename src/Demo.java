// import java.util.Scanner;
class Human{
    private int age;
    private String name;
    public int getAge(){
        return age;
    }
    String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
}

public class Demo {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(20);
        obj.setName("purple cat");
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
    }
}
