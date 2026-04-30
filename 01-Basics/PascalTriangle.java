public class PascalTriangle {
    public static void main(String[] args) {
        int rows = 8;
        System.out.println("Pascal's Triangle up to " + rows + " rows:");
        printPascalsTriangle(rows);
    }

    public static void printPascalsTriangle(int n) {
        for (int line = 1; line <= n; line++) {
            // Print spaces for formatting
            for (int j = 0; j <= n - line; j++) {
                System.out.print("  ");
            }

            // Used to represent C(line, i)
            int c = 1;
            for (int i = 1; i <= line; i++) {
                // The first value in a line is always 1
                System.out.printf("%4d", c);
                c = c * (line - i) / i;
            }
            System.out.println();
        }
    }
}
