public class HollowHourglassPattern {
    public static void main(String[] args) {
        int size = 5;
        System.out.println("Hollow Hourglass Pattern of size " + size + ":");
        printHollowHourglass(size);
    }

    public static void printHollowHourglass(int n) {
        // Upper part
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                if (i == 1 || j == i || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Lower part
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                if (i == 1 || j == i || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
