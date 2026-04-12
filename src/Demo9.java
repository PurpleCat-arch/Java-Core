class Calculator {

    int calculate(int a, int b) {
        return a + b;
    }

    double calculate(double a, double b) {
        return a * b;
    }

    int calculate(int a, int b, int c) {
        return a + b + c;
    }
}

public class Demo9 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.calculate(5, 10));
        System.out.println(calc.calculate(5.5, 10.5));
        System.out.println(calc.calculate(5, 10, 15));
    }
}
