class Adder{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b, int c){
        return a+b+c;
    }
}
public class Main{
    public static void main(String[] args){
        Adder a = new Adder();
        System.out.println(a.add(11,11));
        System.out.println(a.add(11,11,11));
    }
}