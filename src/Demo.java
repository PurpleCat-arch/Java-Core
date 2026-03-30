class Calc{
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
}
class AdvCalc extends Calc{
    public int multiply(int a,int b){
        return a*b;
    }
    public int divide(int a,int b){
        return a/b;
    }
}
class SuperCalc extends AdvCalc{
    public int power(int a,int b){
        return (int) Math.pow(a,b);
    }
}
public class Demo{
    public static void main(String[] args){
        SuperCalc sc = new SuperCalc();
        System.out.println("Addition: "+sc.add(10,5));
        System.out.println("Subtraction: "+sc.sub(10,5));
        System.out.println("Multiplication: "+sc.multiply(10,5));
        System.out.println("Division: "+sc.divide(10,5));
        System.out.println("Power: "+sc.power(2,3));    
    }
}