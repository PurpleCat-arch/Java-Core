public class Student3 {
    int id;
    String name;

    Student3(int i , String n){
        id = i;
        name = n;
    }

    void display(){
        System.out.println(id +" "+ name);
    }
    public static void main(String[] args) {
        Student3 s1 = new Student3(111, "purple cats");
        Student3 s2 = new Student3(222, "purple dog");
        s1.display();
        s2.display();
    }
}
