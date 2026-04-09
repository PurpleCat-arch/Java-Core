public class Age {
    private int age;

    public void setAge(int age) {
        if (age > 0)
            this.age = age;
        else
            System.out.println("Invalid age");
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Age obj = new Age();
        obj.setAge(-5);
        obj.setAge(20);
        System.out.println(obj.getAge());
    }
    
}
