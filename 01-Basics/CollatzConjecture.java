public class CollatzConjecture {
    public static void main(String[] args) {
        long startNumber = 27;
        System.out.println("Collatz Sequence for " + startNumber + ":");
        printCollatzSequence(startNumber);
    }

    public static void printCollatzSequence(long n) {
        if (n <= 0) {
            System.out.println("Number must be positive.");
            return;
        }

        int steps = 0;
        System.out.print(n + " ");
        
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            System.out.print(n + " ");
            steps++;
            
            // Just for formatting to avoid extremely long lines
            if (steps % 15 == 0) {
                System.out.println();
            }
        }
        System.out.println("\nTotal steps: " + steps);
    }
}
