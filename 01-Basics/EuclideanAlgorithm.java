public class EuclideanAlgorithm {
    public static void main(String[] args) {
        int a = 1071;
        int b = 462;
        
        int gcd = findGCD(a, b);
        int lcm = findLCM(a, b, gcd);
        
        System.out.println("Number 1: " + a);
        System.out.println("Number 2: " + b);
        System.out.println("Greatest Common Divisor (GCD): " + gcd);
        System.out.println("Least Common Multiple (LCM): " + lcm);
    }

    // Iterative approach to find GCD
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // LCM formula: (a * b) / GCD(a, b)
    public static int findLCM(int a, int b, int gcd) {
        if (a == 0 || b == 0) return 0;
        return (a * b) / gcd;
    }
}
