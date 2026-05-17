import java.util.*;

/**
 * StudentGradeManager.java
 *
 * A student grade management system that tracks students, their subjects,
 * and grades. Calculates GPA, ranks students, and provides statistical analysis.
 * Demonstrates Collections (HashMap, TreeMap, ArrayList), OOP, Comparator,
 * Streams, and formatted output.
 *
 * Features:
 *   - Add students and record subject-wise marks
 *   - Calculate per-student GPA and letter grade
 *   - Display class statistics (average, topper, pass/fail count)
 *   - Rank students by overall percentage
 *   - View individual report cards
 */
public class StudentGradeManager {

    // ─── Student Model ──────────────────────────────────────────────
    static class Student {
        private final String rollNo;
        private final String name;
        private final Map<String, Double> subjectMarks = new LinkedHashMap<>();

        public Student(String rollNo, String name) {
            this.rollNo = rollNo;
            this.name = name;
        }

        public String getRollNo() { return rollNo; }
        public String getName() { return name; }

        public void addMark(String subject, double marks) {
            if (marks < 0 || marks > 100)
                throw new IllegalArgumentException("Marks must be between 0 and 100.");
            subjectMarks.put(subject, marks);
        }

        public double getPercentage() {
            if (subjectMarks.isEmpty()) return 0;
            double total = subjectMarks.values().stream().mapToDouble(Double::doubleValue).sum();
            return total / subjectMarks.size();
        }

        public String getLetterGrade() {
            double pct = getPercentage();
            if (pct >= 90) return "A+";
            if (pct >= 80) return "A";
            if (pct >= 70) return "B+";
            if (pct >= 60) return "B";
            if (pct >= 50) return "C";
            if (pct >= 40) return "D";
            return "F";
        }

        public boolean hasPassed() {
            return subjectMarks.values().stream().allMatch(m -> m >= 35);
        }

        public void displayReportCard() {
            System.out.printf("%n══════════ REPORT CARD ══════════%n");
            System.out.printf("  Roll No : %s%n", rollNo);
            System.out.printf("  Name    : %s%n", name);
            System.out.println("─────────────────────────────────");
            System.out.printf("  %-15s | %6s%n", "Subject", "Marks");
            System.out.println("─────────────────────────────────");
            subjectMarks.forEach((subj, mark) ->
                System.out.printf("  %-15s | %6.1f%n", subj, mark));
            System.out.println("─────────────────────────────────");
            System.out.printf("  Percentage : %.2f%%%n", getPercentage());
            System.out.printf("  Grade      : %s%n", getLetterGrade());
            System.out.printf("  Status     : %s%n", hasPassed() ? "PASS ✔" : "FAIL ✘");
            System.out.println("═════════════════════════════════");
        }
    }

    // ─── Grade Manager ──────────────────────────────────────────────
    static class GradeManager {
        private final Map<String, Student> students = new LinkedHashMap<>();

        public void addStudent(String rollNo, String name) {
            if (students.containsKey(rollNo))
                throw new IllegalArgumentException("Roll number already exists: " + rollNo);
            students.put(rollNo, new Student(rollNo, name));
        }

        public Student getStudent(String rollNo) {
            Student s = students.get(rollNo);
            if (s == null) throw new NoSuchElementException("Student not found: " + rollNo);
            return s;
        }

        public void addMark(String rollNo, String subject, double marks) {
            getStudent(rollNo).addMark(subject, marks);
        }

        public void displayRankList() {
            if (students.isEmpty()) {
                System.out.println("  No students registered.");
                return;
            }
            List<Student> ranked = new ArrayList<>(students.values());
            ranked.sort(Comparator.comparingDouble(Student::getPercentage).reversed());

            System.out.println("\n╔══════════════════════════════════════════════════╗");
            System.out.println("║                 CLASS RANK LIST                  ║");
            System.out.println("╚══════════════════════════════════════════════════╝");
            System.out.printf("  %-5s %-8s %-18s %7s %5s%n",
                    "Rank", "Roll", "Name", "  %  ", "Grade");
            System.out.println("  " + "─".repeat(46));

            int rank = 1;
            for (Student s : ranked) {
                System.out.printf("  %-5d %-8s %-18s %6.2f%% %5s%n",
                        rank++, s.getRollNo(), s.getName(),
                        s.getPercentage(), s.getLetterGrade());
            }
        }

        public void displayClassStats() {
            if (students.isEmpty()) {
                System.out.println("  No students registered.");
                return;
            }
            double avg = students.values().stream()
                    .mapToDouble(Student::getPercentage).average().orElse(0);
            long passCount = students.values().stream().filter(Student::hasPassed).count();
            long failCount = students.size() - passCount;
            Student topper = students.values().stream()
                    .max(Comparator.comparingDouble(Student::getPercentage)).orElse(null);

            System.out.println("\n--- CLASS STATISTICS ---");
            System.out.printf("  Total students : %d%n", students.size());
            System.out.printf("  Class average  : %.2f%%%n", avg);
            System.out.printf("  Passed         : %d%n", passCount);
            System.out.printf("  Failed         : %d%n", failCount);
            if (topper != null)
                System.out.printf("  Topper         : %s (%s) – %.2f%%%n",
                        topper.getName(), topper.getRollNo(), topper.getPercentage());
        }
    }

    // ─── Main ───────────────────────────────────────────────────────
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GradeManager gm = new GradeManager();

        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║    STUDENT GRADE MANAGER             ║");
        System.out.println("╚══════════════════════════════════════╝");

        boolean running = true;
        while (running) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add Student");
            System.out.println("2. Add Marks");
            System.out.println("3. View Report Card");
            System.out.println("4. View Rank List");
            System.out.println("5. View Class Statistics");
            System.out.println("0. Exit");
            System.out.print("Choice: ");

            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("⚠ Invalid input.");
                continue;
            }

            try {
                switch (choice) {
                    case 1 -> {
                        System.out.print("Roll No: ");
                        String roll = sc.nextLine().trim();
                        System.out.print("Name: ");
                        String name = sc.nextLine().trim();
                        gm.addStudent(roll, name);
                        System.out.println("✔ Student added.");
                    }
                    case 2 -> {
                        System.out.print("Roll No: ");
                        String roll = sc.nextLine().trim();
                        System.out.print("Subject: ");
                        String subj = sc.nextLine().trim();
                        System.out.print("Marks (0–100): ");
                        double marks = Double.parseDouble(sc.nextLine().trim());
                        gm.addMark(roll, subj, marks);
                        System.out.println("✔ Marks recorded.");
                    }
                    case 3 -> {
                        System.out.print("Roll No: ");
                        String roll = sc.nextLine().trim();
                        gm.getStudent(roll).displayReportCard();
                    }
                    case 4 -> gm.displayRankList();
                    case 5 -> gm.displayClassStats();
                    case 0 -> {
                        running = false;
                        System.out.println("Goodbye!");
                    }
                    default -> System.out.println("⚠ Invalid choice.");
                }
            } catch (IllegalArgumentException | NoSuchElementException e) {
                System.out.println("✘ " + e.getMessage());
            }
        }
        sc.close();
    }
}
