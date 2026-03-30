class Car{
    public void drive(){
        System.out.println("Car is driving");
    }
    public void playMusic(){
        System.out.println("Playing music in the car");
    }
}
public class Demo{
    public static void main(String[] args){
        Car obj = new Car();
        obj.drive();
        obj.playMusic();
    }
}