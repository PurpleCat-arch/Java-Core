import java.util.*;

/**
 * ContactBookApp.java
 *
 * A digital contact book that stores, searches, and manages contacts.
 * Demonstrates OOP, Collections (TreeMap for alphabetical ordering),
 * regex validation, and formatted output.
 *
 * Features:
 *   - Add contacts with name, phone, and email
 *   - Search contacts by name (partial, case-insensitive)
 *   - Edit and delete contacts
 *   - Display all contacts in alphabetical order
 *   - Input validation for phone and email
 */
public class ContactBookApp {

    static class Contact implements Comparable<Contact> {
        private String name;
        private String phone;
        private String email;

        public Contact(String name, String phone, String email) {
            setName(name);
            setPhone(phone);
            setEmail(email);
        }

        public String getName() { return name; }
        public String getPhone() { return phone; }
        public String getEmail() { return email; }

        public void setName(String n) {
            if (n == null || n.isBlank()) throw new IllegalArgumentException("Name cannot be empty.");
            this.name = n.trim();
        }

        public void setPhone(String p) {
            if (p != null && !p.isBlank() && !p.matches("\\+?[0-9\\-\\s]{7,15}"))
                throw new IllegalArgumentException("Invalid phone format.");
            this.phone = (p == null || p.isBlank()) ? "N/A" : p.trim();
        }

        public void setEmail(String e) {
            if (e != null && !e.isBlank() && !e.matches("^[\\w.%+-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$"))
                throw new IllegalArgumentException("Invalid email format.");
            this.email = (e == null || e.isBlank()) ? "N/A" : e.trim();
        }

        @Override
        public int compareTo(Contact o) { return name.compareToIgnoreCase(o.name); }

        @Override
        public String toString() {
            return String.format("| %-20s | %-15s | %-25s |", name, phone, email);
        }
    }

    static class ContactBook {
        private final TreeMap<String, Contact> contacts = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

        public void add(String name, String phone, String email) {
            if (contacts.containsKey(name))
                throw new IllegalArgumentException("Contact '" + name + "' already exists.");
            contacts.put(name, new Contact(name, phone, email));
        }

        public Contact get(String name) {
            Contact c = contacts.get(name);
            if (c == null) throw new NoSuchElementException("Contact not found: " + name);
            return c;
        }

        public void delete(String name) {
            if (contacts.remove(name) == null)
                throw new NoSuchElementException("Contact not found: " + name);
        }

        public List<Contact> search(String keyword) {
            String lower = keyword.toLowerCase();
            List<Contact> results = new ArrayList<>();
            for (Contact c : contacts.values())
                if (c.getName().toLowerCase().contains(lower)) results.add(c);
            return results;
        }

        public void displayAll() {
            if (contacts.isEmpty()) { System.out.println("  Contact book is empty."); return; }
            String border = "+" + "-".repeat(22) + "+" + "-".repeat(17) + "+" + "-".repeat(27) + "+";
            System.out.println(border);
            System.out.printf("| %-20s | %-15s | %-25s |%n", "Name", "Phone", "Email");
            System.out.println(border);
            contacts.values().forEach(System.out::println);
            System.out.println(border);
            System.out.printf("  Total contacts: %d%n", contacts.size());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContactBook book = new ContactBook();

        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║      DIGITAL CONTACT BOOK          ║");
        System.out.println("╚════════════════════════════════════╝");

        boolean running = true;
        while (running) {
            System.out.println("\n1. Add  2. Search  3. Edit  4. Delete  5. View All  0. Exit");
            System.out.print("Choice: ");
            int ch;
            try { ch = Integer.parseInt(sc.nextLine().trim()); }
            catch (NumberFormatException e) { System.out.println("⚠ Invalid input."); continue; }

            try {
                switch (ch) {
                    case 1 -> {
                        System.out.print("Name: ");  String n = sc.nextLine().trim();
                        System.out.print("Phone: "); String p = sc.nextLine().trim();
                        System.out.print("Email: "); String e = sc.nextLine().trim();
                        book.add(n, p, e);
                        System.out.println("✔ Contact added.");
                    }
                    case 2 -> {
                        System.out.print("Keyword: ");
                        List<Contact> res = book.search(sc.nextLine().trim());
                        if (res.isEmpty()) System.out.println("  No results.");
                        else res.forEach(c -> System.out.printf("  • %s — %s — %s%n",
                                c.getName(), c.getPhone(), c.getEmail()));
                    }
                    case 3 -> {
                        System.out.print("Name: "); Contact c = book.get(sc.nextLine().trim());
                        System.out.print("New Phone (blank=skip): "); String p = sc.nextLine().trim();
                        if (!p.isEmpty()) c.setPhone(p);
                        System.out.print("New Email (blank=skip): "); String e = sc.nextLine().trim();
                        if (!e.isEmpty()) c.setEmail(e);
                        System.out.println("✔ Updated.");
                    }
                    case 4 -> { System.out.print("Name: "); book.delete(sc.nextLine().trim());
                        System.out.println("✔ Deleted."); }
                    case 5 -> book.displayAll();
                    case 0 -> { running = false; System.out.println("Goodbye!"); }
                    default -> System.out.println("⚠ Invalid choice.");
                }
            } catch (Exception e) { System.out.println("✘ " + e.getMessage()); }
        }
        sc.close();
    }
}
