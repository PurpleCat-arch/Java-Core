
interface car{
    void drive();
}
interface Airplane{
    void fly();
}
class FlyingCar implements Car,Airplane{
    public void drive(){
        System.out.println("Driving on road");
    }
    @Override
    public void fly(){
        System.out.println("Flying in sky");
    }
}
public class Main{
    public static void main(String[] args){
        FlyingCar fc = new FlyingCar();
        fc.drive();
        fc.fly();
    }
}