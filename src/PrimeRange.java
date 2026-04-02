public class PrimeRange {
    public static void main(String[] args) {
        int start = 10, end = 50;

        for (int num = start; num <= end; num++) {
            boolean isPrime = true;

            if (num <= 1) continue;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime)
                System.out.print(num + " ");
        }
    }
}