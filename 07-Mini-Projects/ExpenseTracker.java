import java.util.*;

/**
 * ExpenseTracker.java
 *
 * A personal expense tracker that records, categorises, and summarises expenses.
 * Demonstrates OOP, Collections (ArrayList, HashMap), Streams, date handling
 * with simple string dates, and formatted reports.
 *
 * Features:
 *   - Add expenses with amount, category, and description
 *   - View all expenses in tabular format
 *   - Category-wise summary with totals
 *   - Monthly spending report
 *   - Delete expenses by ID
 */
public class ExpenseTracker {

    static class Expense {
        private static int counter = 0;
        private final int id;
        private final String date;      // format: YYYY-MM-DD
        private final String category;
        private final double amount;
        private final String description;

        public Expense(String date, String category, double amount, String description) {
            this.id = ++counter;
            this.date = date;
            this.category = category;
            this.amount = amount;
            this.description = description;
        }

        public int getId() { return id; }
        public String getDate() { return date; }
        public String getCategory() { return category; }
        public double getAmount() { return amount; }
        public String getMonth() { return date.length() >= 7 ? date.substring(0, 7) : "Unknown"; }

        @Override
        public String toString() {
            return String.format("| %4d | %-10s | %-12s | ₹%,10.2f | %-20s |",
                    id, date, category, amount, description);
        }
    }

    static class Tracker {
        private final List<Expense> expenses = new ArrayList<>();

        public void add(String date, String category, double amount, String desc) {
            if (amount <= 0) throw new IllegalArgumentException("Amount must be positive.");
            expenses.add(new Expense(date, category, amount, desc));
        }

        public void remove(int id) {
            boolean removed = expenses.removeIf(e -> e.getId() == id);
            if (!removed) throw new NoSuchElementException("Expense #" + id + " not found.");
        }

        public void displayAll() {
            if (expenses.isEmpty()) { System.out.println("  No expenses recorded."); return; }
            String b = "+" + "-".repeat(6) + "+" + "-".repeat(12) + "+" + "-".repeat(14) +
                    "+" + "-".repeat(13) + "+" + "-".repeat(22) + "+";
            System.out.println(b);
            System.out.printf("| %4s | %-10s | %-12s | %11s | %-20s |%n",
                    "ID", "Date", "Category", "Amount", "Description");
            System.out.println(b);
            expenses.forEach(System.out::println);
            System.out.println(b);
            double total = expenses.stream().mapToDouble(Expense::getAmount).sum();
            System.out.printf("  Grand Total: ₹%,.2f%n", total);
        }

        public void categorySummary() {
            if (expenses.isEmpty()) { System.out.println("  No expenses."); return; }
            Map<String, Double> map = new LinkedHashMap<>();
            for (Expense e : expenses)
                map.merge(e.getCategory(), e.getAmount(), Double::sum);

            System.out.println("\n--- CATEGORY SUMMARY ---");
            double total = 0;
            for (var entry : map.entrySet()) {
                System.out.printf("  %-14s : ₹%,.2f%n", entry.getKey(), entry.getValue());
                total += entry.getValue();
            }
            System.out.printf("  %-14s : ₹%,.2f%n", "TOTAL", total);
        }

        public void monthlySummary() {
            if (expenses.isEmpty()) { System.out.println("  No expenses."); return; }
            Map<String, Double> map = new TreeMap<>();
            for (Expense e : expenses)
                map.merge(e.getMonth(), e.getAmount(), Double::sum);

            System.out.println("\n--- MONTHLY SUMMARY ---");
            for (var entry : map.entrySet())
                System.out.printf("  %s : ₹%,.2f%n", entry.getKey(), entry.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tracker tracker = new Tracker();

        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║      PERSONAL EXPENSE TRACKER      ║");
        System.out.println("╚════════════════════════════════════╝");

        boolean running = true;
        while (running) {
            System.out.println("\n1. Add  2. View All  3. Category Summary  4. Monthly  5. Delete  0. Exit");
            System.out.print("Choice: ");
            int ch;
            try { ch = Integer.parseInt(sc.nextLine().trim()); }
            catch (NumberFormatException e) { System.out.println("⚠ Invalid."); continue; }

            try {
                switch (ch) {
                    case 1 -> {
                        System.out.print("Date (YYYY-MM-DD): "); String d = sc.nextLine().trim();
                        System.out.print("Category: "); String c = sc.nextLine().trim();
                        System.out.print("Amount: "); double a = Double.parseDouble(sc.nextLine().trim());
                        System.out.print("Description: "); String desc = sc.nextLine().trim();
                        tracker.add(d, c, a, desc);
                        System.out.println("✔ Expense recorded.");
                    }
                    case 2 -> tracker.displayAll();
                    case 3 -> tracker.categorySummary();
                    case 4 -> tracker.monthlySummary();
                    case 5 -> {
                        System.out.print("Expense ID: ");
                        tracker.remove(Integer.parseInt(sc.nextLine().trim()));
                        System.out.println("✔ Deleted.");
                    }
                    case 0 -> { running = false; System.out.println("Goodbye!"); }
                    default -> System.out.println("⚠ Invalid choice.");
                }
            } catch (Exception e) { System.out.println("✘ " + e.getMessage()); }
        }
        sc.close();
    }
}
