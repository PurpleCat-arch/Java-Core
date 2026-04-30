public class PerfectNumberRange {
    public static void main(String[] args) {
        int start = 1;
        int end = 10000;
        System.out.println("Perfect numbers between " + start + " and " + end + ":");
        findPerfectNumbers(start, end);
    }

    public static void findPerfectNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPerfect(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPerfect(int num) {
        if (num <= 1) return false;
        
        int sum = 1; // 1 is always a proper divisor
        
        // Find all divisors up to sqrt(num)
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                int quotient = num / i;
                if (quotient != i) {
                    sum += quotient;
                }
            }
        }
        
        return sum == num;
    }
}
