import java.util.*;

/**
 * NumberGuessingGame.java
 *
 * A number guessing game with difficulty levels, hint system, and score tracking.
 * Demonstrates Random, loops, conditionals, input validation, and game logic.
 *
 * Features:
 *   - Three difficulty levels (Easy/Medium/Hard)
 *   - Hot/Cold hint system
 *   - Attempt counter and best score tracking
 *   - Replay support
 */
public class NumberGuessingGame {

    enum Difficulty {
        EASY(50, 10), MEDIUM(100, 7), HARD(500, 12);
        final int range;
        final int maxAttempts;
        Difficulty(int range, int maxAttempts) {
            this.range = range;
            this.maxAttempts = maxAttempts;
        }
    }

    private static final Map<Difficulty, Integer> bestScores = new EnumMap<>(Difficulty.class);

    static String getHint(int guess, int target, int range) {
        int diff = Math.abs(guess - target);
        double ratio = (double) diff / range;
        if (ratio < 0.05) return "🔥 Burning hot!";
        if (ratio < 0.15) return "🌡️  Very warm!";
        if (ratio < 0.30) return "😐 Warm.";
        if (ratio < 0.50) return "❄️  Cold.";
        return "🧊 Freezing cold!";
    }

    static void playRound(Scanner sc, Difficulty diff) {
        Random rng = new Random();
        int target = rng.nextInt(diff.range) + 1;
        int attempts = 0;

        System.out.printf("%n🎯 Guess a number between 1 and %d. You have %d attempts.%n",
                diff.range, diff.maxAttempts);

        while (attempts < diff.maxAttempts) {
            System.out.printf("  Attempt %d/%d — Your guess: ", attempts + 1, diff.maxAttempts);
            int guess;
            try { guess = Integer.parseInt(sc.nextLine().trim()); }
            catch (NumberFormatException e) { System.out.println("  ⚠ Enter a valid number."); continue; }

            attempts++;

            if (guess == target) {
                System.out.printf("  🎉 Correct! You got it in %d attempt(s)!%n", attempts);
                Integer best = bestScores.get(diff);
                if (best == null || attempts < best) {
                    bestScores.put(diff, attempts);
                    System.out.println("  🏆 New best score for " + diff.name() + "!");
                }
                return;
            }

            String direction = guess < target ? "📈 Higher!" : "📉 Lower!";
            System.out.printf("  %s  %s%n", direction, getHint(guess, target, diff.range));
        }

        System.out.printf("  😞 Out of attempts! The number was %d.%n", target);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║      NUMBER GUESSING GAME          ║");
        System.out.println("╚════════════════════════════════════╝");

        boolean running = true;
        while (running) {
            System.out.println("\n--- SELECT DIFFICULTY ---");
            System.out.println("1. Easy   (1–50,  10 attempts)");
            System.out.println("2. Medium (1–100,  7 attempts)");
            System.out.println("3. Hard   (1–500, 12 attempts)");
            System.out.println("4. View Best Scores");
            System.out.println("0. Exit");
            System.out.print("Choice: ");

            int ch;
            try { ch = Integer.parseInt(sc.nextLine().trim()); }
            catch (NumberFormatException e) { System.out.println("⚠ Invalid."); continue; }

            switch (ch) {
                case 1 -> playRound(sc, Difficulty.EASY);
                case 2 -> playRound(sc, Difficulty.MEDIUM);
                case 3 -> playRound(sc, Difficulty.HARD);
                case 4 -> {
                    System.out.println("\n--- BEST SCORES ---");
                    for (Difficulty d : Difficulty.values()) {
                        Integer b = bestScores.get(d);
                        System.out.printf("  %-6s : %s%n", d.name(),
                                b == null ? "No score yet" : b + " attempt(s)");
                    }
                }
                case 0 -> { running = false; System.out.println("Goodbye!"); }
                default -> System.out.println("⚠ Invalid choice.");
            }
        }
        sc.close();
    }
}
