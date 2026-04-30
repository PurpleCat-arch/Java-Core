public class ArmstrongNumberRange {
    public static void main(String[] args) {
        int start = 1;
        int end = 10000;
        System.out.println("Armstrong numbers between " + start + " and " + end + ":");
        findArmstrongNumbers(start, end);
    }

    public static void findArmstrongNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length();

        while (number > 0) {
            int remainder = number % 10;
            int power = 1;
            for (int i = 0; i < digits; i++) {
                power *= remainder;
            }
            sum += power;
            number /= 10;
        }

        return sum == originalNumber;
    }
}
