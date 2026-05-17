import java.util.*;

/**
 * PasswordGenerator.java
 *
 * A configurable password generator that creates secure random passwords.
 * Demonstrates String manipulation, Random, Collections, and input validation.
 *
 * Features:
 *   - Configurable length and character sets
 *   - Strength meter (weak/medium/strong)
 *   - Generate multiple passwords at once
 *   - Copy-friendly output
 */
public class PasswordGenerator {

    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SYMBOLS = "!@#$%^&*()-_=+[]{}|;:,.<>?";

    static String generate(int length, boolean upper, boolean lower,
                           boolean digits, boolean symbols) {
        if (length < 4) throw new IllegalArgumentException("Length must be at least 4.");
        StringBuilder pool = new StringBuilder();
        List<Character> mandatory = new ArrayList<>();
        Random rng = new Random();

        if (upper)   { pool.append(UPPER);   mandatory.add(UPPER.charAt(rng.nextInt(UPPER.length()))); }
        if (lower)   { pool.append(LOWER);   mandatory.add(LOWER.charAt(rng.nextInt(LOWER.length()))); }
        if (digits)  { pool.append(DIGITS);  mandatory.add(DIGITS.charAt(rng.nextInt(DIGITS.length()))); }
        if (symbols) { pool.append(SYMBOLS); mandatory.add(SYMBOLS.charAt(rng.nextInt(SYMBOLS.length()))); }

        if (pool.isEmpty()) throw new IllegalArgumentException("Select at least one character set.");

        StringBuilder pwd = new StringBuilder();
        for (char c : mandatory) pwd.append(c);
        for (int i = mandatory.size(); i < length; i++)
            pwd.append(pool.charAt(rng.nextInt(pool.length())));

        // shuffle
        List<Character> chars = new ArrayList<>();
        for (char c : pwd.toString().toCharArray()) chars.add(c);
        Collections.shuffle(chars, rng);
        StringBuilder result = new StringBuilder();
        chars.forEach(result::append);
        return result.toString();
    }

    static String evaluateStrength(String pwd) {
        int score = 0;
        if (pwd.length() >= 8) score++;
        if (pwd.length() >= 12) score++;
        if (pwd.matches(".*[A-Z].*")) score++;
        if (pwd.matches(".*[a-z].*")) score++;
        if (pwd.matches(".*[0-9].*")) score++;
        if (pwd.matches(".*[^a-zA-Z0-9].*")) score++;

        if (score >= 5) return "🟢 STRONG";
        if (score >= 3) return "🟡 MEDIUM";
        return "🔴 WEAK";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║     SECURE PASSWORD GENERATOR      ║");
        System.out.println("╚════════════════════════════════════╝");

        boolean running = true;
        while (running) {
            System.out.println("\n1. Generate Password  2. Check Strength  0. Exit");
            System.out.print("Choice: ");
            int ch;
            try { ch = Integer.parseInt(sc.nextLine().trim()); }
            catch (NumberFormatException e) { System.out.println("⚠ Invalid."); continue; }

            try {
                switch (ch) {
                    case 1 -> {
                        System.out.print("Length (min 4): ");
                        int len = Integer.parseInt(sc.nextLine().trim());
                        System.out.print("Include uppercase? (y/n): ");
                        boolean u = sc.nextLine().trim().equalsIgnoreCase("y");
                        System.out.print("Include lowercase? (y/n): ");
                        boolean l = sc.nextLine().trim().equalsIgnoreCase("y");
                        System.out.print("Include digits? (y/n): ");
                        boolean d = sc.nextLine().trim().equalsIgnoreCase("y");
                        System.out.print("Include symbols? (y/n): ");
                        boolean s = sc.nextLine().trim().equalsIgnoreCase("y");
                        System.out.print("How many passwords? ");
                        int count = Integer.parseInt(sc.nextLine().trim());
                        System.out.println("\n--- Generated Passwords ---");
                        for (int i = 1; i <= count; i++) {
                            String pwd = generate(len, u, l, d, s);
                            System.out.printf("  %d. %s  %s%n", i, pwd, evaluateStrength(pwd));
                        }
                    }
                    case 2 -> {
                        System.out.print("Enter password to check: ");
                        String pwd = sc.nextLine();
                        System.out.println("  Strength: " + evaluateStrength(pwd));
                    }
                    case 0 -> { running = false; System.out.println("Goodbye!"); }
                    default -> System.out.println("⚠ Invalid choice.");
                }
            } catch (IllegalArgumentException e) { System.out.println("✘ " + e.getMessage()); }
        }
        sc.close();
    }
}
