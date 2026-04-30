public class TwinPrimes {
    public static void main(String[] args) {
        int max = 100;
        System.out.println("Twin Primes up to " + max + ":");
        findTwinPrimes(max);
    }

    public static void findTwinPrimes(int limit) {
        int previousPrime = -1;
        
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                if (previousPrime != -1 && (i - previousPrime) == 2) {
                    System.out.println("(" + previousPrime + ", " + i + ")");
                }
                previousPrime = i;
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;

        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
