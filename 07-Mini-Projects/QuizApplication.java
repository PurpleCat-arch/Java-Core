import java.util.*;

/**
 * QuizApplication.java
 *
 * A timed, multiple-choice quiz engine with scoring and review.
 * Demonstrates Collections (ArrayList, HashMap), OOP, enhanced switch,
 * String formatting, and input validation.
 *
 * Features:
 *   - Configurable question bank
 *   - Randomised question order
 *   - Instant feedback on each answer
 *   - Final score report with percentage
 *   - Review of incorrect answers
 */
public class QuizApplication {

    // ─── Question Model ─────────────────────────────────────────────
    static class Question {
        private final String prompt;
        private final String[] options;  // exactly 4 options (A–D)
        private final char correctAnswer; // 'A', 'B', 'C', or 'D'

        public Question(String prompt, String[] options, char correctAnswer) {
            this.prompt = prompt;
            this.options = options;
            this.correctAnswer = Character.toUpperCase(correctAnswer);
        }

        public String getPrompt() { return prompt; }
        public String[] getOptions() { return options; }
        public char getCorrectAnswer() { return correctAnswer; }

        public void display(int questionNumber) {
            System.out.printf("%nQ%d. %s%n", questionNumber, prompt);
            char label = 'A';
            for (String opt : options) {
                System.out.printf("   %c) %s%n", label++, opt);
            }
        }
    }

    // ─── Result Tracker ─────────────────────────────────────────────
    static class QuizResult {
        private final List<Question> incorrectQuestions = new ArrayList<>();
        private final Map<Question, Character> userAnswers = new LinkedHashMap<>();
        private int correct = 0;
        private int total = 0;

        public void record(Question q, char userAnswer) {
            total++;
            userAnswers.put(q, userAnswer);
            if (Character.toUpperCase(userAnswer) == q.getCorrectAnswer()) {
                correct++;
            } else {
                incorrectQuestions.add(q);
            }
        }

        public void displaySummary() {
            double pct = (total == 0) ? 0 : (correct * 100.0 / total);
            System.out.println("\n╔══════════════════════════════════╗");
            System.out.println("║         QUIZ RESULTS             ║");
            System.out.println("╚══════════════════════════════════╝");
            System.out.printf("  Score: %d / %d  (%.1f%%)%n", correct, total, pct);

            if (pct == 100)      System.out.println("  🏆 Perfect score! Outstanding!");
            else if (pct >= 80)  System.out.println("  🌟 Great job!");
            else if (pct >= 50)  System.out.println("  👍 Good effort. Keep practising!");
            else                 System.out.println("  📖 Review the topics and try again.");

            if (!incorrectQuestions.isEmpty()) {
                System.out.println("\n--- Incorrect Answers ---");
                for (Question q : incorrectQuestions) {
                    System.out.printf("  • %s%n", q.getPrompt());
                    System.out.printf("    Your answer: %c  |  Correct: %c%n",
                            userAnswers.get(q), q.getCorrectAnswer());
                }
            }
        }
    }

    // ─── Question Bank ──────────────────────────────────────────────
    private static List<Question> buildQuestionBank() {
        List<Question> bank = new ArrayList<>();

        bank.add(new Question(
            "Which keyword is used to inherit a class in Java?",
            new String[]{"implements", "extends", "inherits", "super"}, 'B'));

        bank.add(new Question(
            "What is the default value of an int variable in Java?",
            new String[]{"null", "0", "1", "undefined"}, 'B'));

        bank.add(new Question(
            "Which collection does NOT allow duplicate elements?",
            new String[]{"ArrayList", "LinkedList", "HashSet", "Vector"}, 'C'));

        bank.add(new Question(
            "What does JVM stand for?",
            new String[]{"Java Virtual Machine", "Java Variable Method",
                         "Java Visual Manager", "Java Version Module"}, 'A'));

        bank.add(new Question(
            "Which method is the entry point of a Java application?",
            new String[]{"start()", "init()", "main()", "run()"}, 'C'));

        bank.add(new Question(
            "Which access modifier makes a member visible only within its own class?",
            new String[]{"public", "protected", "default", "private"}, 'D'));

        bank.add(new Question(
            "What is the size of a char in Java?",
            new String[]{"1 byte", "2 bytes", "4 bytes", "8 bytes"}, 'B'));

        bank.add(new Question(
            "Which of these is NOT a primitive type in Java?",
            new String[]{"int", "float", "String", "boolean"}, 'C'));

        bank.add(new Question(
            "What does the 'final' keyword prevent on a class?",
            new String[]{"Instantiation", "Inheritance", "Serialization", "Compilation"}, 'B'));

        bank.add(new Question(
            "Which interface must be implemented for custom sorting in Java?",
            new String[]{"Iterable", "Serializable", "Comparator", "Cloneable"}, 'C'));

        return bank;
    }

    // ─── Main ───────────────────────────────────────────────────────
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Question> questions = buildQuestionBank();
        Collections.shuffle(questions);

        System.out.println("╔══════════════════════════════════╗");
        System.out.println("║       JAVA QUIZ APPLICATION      ║");
        System.out.println("╚══════════════════════════════════╝");
        System.out.printf("  Total questions: %d%n", questions.size());
        System.out.println("  Enter A, B, C, or D for each question.\n");

        QuizResult result = new QuizResult();

        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);
            q.display(i + 1);

            char answer;
            while (true) {
                System.out.print("  Your answer: ");
                String input = sc.nextLine().trim().toUpperCase();
                if (input.length() == 1 && "ABCD".indexOf(input.charAt(0)) >= 0) {
                    answer = input.charAt(0);
                    break;
                }
                System.out.println("  ⚠ Please enter A, B, C, or D.");
            }

            result.record(q, answer);

            if (answer == q.getCorrectAnswer()) {
                System.out.println("  ✔ Correct!");
            } else {
                System.out.printf("  ✘ Wrong. The correct answer is %c.%n", q.getCorrectAnswer());
            }
        }

        result.displaySummary();
        sc.close();
    }
}
