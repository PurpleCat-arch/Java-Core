import java.util.*;

/**
 * LibraryCatalog.java
 *
 * A library catalog system for managing books, members, and borrowing.
 * Demonstrates OOP (encapsulation, composition), Collections (HashMap,
 * ArrayList), exception handling, and formatted console output.
 *
 * Features:
 *   - Add and search books by title/author
 *   - Borrow and return books with tracking
 *   - View available vs borrowed books
 *   - Member management
 */
public class LibraryCatalog {

    static class Book {
        private final String isbn;
        private final String title;
        private final String author;
        private boolean available = true;
        private String borrowedBy = null;

        public Book(String isbn, String title, String author) {
            this.isbn = isbn; this.title = title; this.author = author;
        }

        public String getIsbn() { return isbn; }
        public String getTitle() { return title; }
        public String getAuthor() { return author; }
        public boolean isAvailable() { return available; }
        public String getBorrowedBy() { return borrowedBy; }

        public void borrow(String memberId) { available = false; borrowedBy = memberId; }
        public void returnBook() { available = true; borrowedBy = null; }

        @Override
        public String toString() {
            String status = available ? "Available" : "Borrowed by " + borrowedBy;
            return String.format("| %-8s | %-25s | %-18s | %-20s |",
                    isbn, title, author, status);
        }
    }

    static class Member {
        private final String memberId;
        private final String name;
        private final List<String> borrowedIsbns = new ArrayList<>();

        public Member(String memberId, String name) {
            this.memberId = memberId; this.name = name;
        }

        public String getMemberId() { return memberId; }
        public String getName() { return name; }
        public List<String> getBorrowedIsbns() { return borrowedIsbns; }
    }

    static class Library {
        private final Map<String, Book> books = new LinkedHashMap<>();
        private final Map<String, Member> members = new LinkedHashMap<>();
        private int bookCounter = 1;
        private int memberCounter = 1;

        public Book addBook(String title, String author) {
            String isbn = String.format("ISBN%04d", bookCounter++);
            Book b = new Book(isbn, title, author);
            books.put(isbn, b);
            return b;
        }

        public Member addMember(String name) {
            String id = String.format("M%04d", memberCounter++);
            Member m = new Member(id, name);
            members.put(id, m);
            return m;
        }

        public void borrowBook(String isbn, String memberId) {
            Book b = books.get(isbn);
            if (b == null) throw new NoSuchElementException("Book not found: " + isbn);
            Member m = members.get(memberId);
            if (m == null) throw new NoSuchElementException("Member not found: " + memberId);
            if (!b.isAvailable()) throw new IllegalStateException("Book is already borrowed.");
            if (m.getBorrowedIsbns().size() >= 3)
                throw new IllegalStateException("Member has reached max borrow limit (3).");
            b.borrow(memberId);
            m.getBorrowedIsbns().add(isbn);
        }

        public void returnBook(String isbn) {
            Book b = books.get(isbn);
            if (b == null) throw new NoSuchElementException("Book not found: " + isbn);
            if (b.isAvailable()) throw new IllegalStateException("Book is not borrowed.");
            Member m = members.get(b.getBorrowedBy());
            if (m != null) m.getBorrowedIsbns().remove(isbn);
            b.returnBook();
        }

        public List<Book> search(String keyword) {
            String lower = keyword.toLowerCase();
            List<Book> results = new ArrayList<>();
            for (Book b : books.values())
                if (b.getTitle().toLowerCase().contains(lower)
                        || b.getAuthor().toLowerCase().contains(lower))
                    results.add(b);
            return results;
        }

        public void displayCatalog() {
            if (books.isEmpty()) { System.out.println("  Catalog is empty."); return; }
            String border = "+" + "-".repeat(10) + "+" + "-".repeat(27) +
                    "+" + "-".repeat(20) + "+" + "-".repeat(22) + "+";
            System.out.println(border);
            System.out.printf("| %-8s | %-25s | %-18s | %-20s |%n",
                    "ISBN", "Title", "Author", "Status");
            System.out.println(border);
            books.values().forEach(System.out::println);
            System.out.println(border);
            long avail = books.values().stream().filter(Book::isAvailable).count();
            System.out.printf("  Total: %d  |  Available: %d  |  Borrowed: %d%n",
                    books.size(), avail, books.size() - avail);
        }

        public void displayMembers() {
            if (members.isEmpty()) { System.out.println("  No members."); return; }
            System.out.println("\n--- MEMBERS ---");
            for (Member m : members.values())
                System.out.printf("  %s — %s — Books borrowed: %d%n",
                        m.getMemberId(), m.getName(), m.getBorrowedIsbns().size());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║       LIBRARY CATALOG SYSTEM       ║");
        System.out.println("╚════════════════════════════════════╝");

        boolean running = true;
        while (running) {
            System.out.println("\n1. Add Book  2. Add Member  3. Borrow  4. Return");
            System.out.println("5. Search  6. Catalog  7. Members  0. Exit");
            System.out.print("Choice: ");
            int ch;
            try { ch = Integer.parseInt(sc.nextLine().trim()); }
            catch (NumberFormatException e) { System.out.println("⚠ Invalid."); continue; }

            try {
                switch (ch) {
                    case 1 -> {
                        System.out.print("Title: "); String t = sc.nextLine().trim();
                        System.out.print("Author: "); String a = sc.nextLine().trim();
                        Book b = lib.addBook(t, a);
                        System.out.println("✔ Added → " + b.getIsbn());
                    }
                    case 2 -> {
                        System.out.print("Member Name: ");
                        Member m = lib.addMember(sc.nextLine().trim());
                        System.out.println("✔ Registered → " + m.getMemberId());
                    }
                    case 3 -> {
                        System.out.print("ISBN: "); String isbn = sc.nextLine().trim();
                        System.out.print("Member ID: "); String mid = sc.nextLine().trim();
                        lib.borrowBook(isbn, mid);
                        System.out.println("✔ Book borrowed.");
                    }
                    case 4 -> {
                        System.out.print("ISBN: ");
                        lib.returnBook(sc.nextLine().trim());
                        System.out.println("✔ Book returned.");
                    }
                    case 5 -> {
                        System.out.print("Keyword: ");
                        List<Book> res = lib.search(sc.nextLine().trim());
                        if (res.isEmpty()) System.out.println("  No results.");
                        else res.forEach(b -> System.out.printf("  • %s — \"%s\" by %s%n",
                                b.getIsbn(), b.getTitle(), b.getAuthor()));
                    }
                    case 6 -> lib.displayCatalog();
                    case 7 -> lib.displayMembers();
                    case 0 -> { running = false; System.out.println("Goodbye!"); }
                    default -> System.out.println("⚠ Invalid choice.");
                }
            } catch (Exception e) { System.out.println("✘ " + e.getMessage()); }
        }
        sc.close();
    }
}
