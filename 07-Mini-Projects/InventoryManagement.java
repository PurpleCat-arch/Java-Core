import java.util.*;

/**
 * InventoryManagement.java
 *
 * A product inventory system for a small store. Supports adding, updating,
 * searching, and removing products with stock tracking and low-stock alerts.
 * Demonstrates OOP, Collections (TreeMap for sorted display), exception handling,
 * and formatted tabular output.
 *
 * Features:
 *   - Add / update / delete products
 *   - Search by name (partial match)
 *   - View inventory sorted by product ID
 *   - Low-stock alert threshold
 *   - Total inventory value calculation
 */
public class InventoryManagement {

    // ─── Product Model ──────────────────────────────────────────────
    static class Product {
        private final String productId;
        private String name;
        private double price;
        private int quantity;

        public Product(String productId, String name, double price, int quantity) {
            this.productId = productId;
            this.name = name;
            setPrice(price);
            setQuantity(quantity);
        }

        public String getProductId() { return productId; }
        public String getName() { return name; }
        public double getPrice() { return price; }
        public int getQuantity() { return quantity; }

        public void setName(String name) { this.name = name; }

        public void setPrice(double price) {
            if (price < 0) throw new IllegalArgumentException("Price cannot be negative.");
            this.price = price;
        }

        public void setQuantity(int quantity) {
            if (quantity < 0) throw new IllegalArgumentException("Quantity cannot be negative.");
            this.quantity = quantity;
        }

        public double totalValue() { return price * quantity; }

        public boolean isLowStock(int threshold) { return quantity <= threshold; }

        @Override
        public String toString() {
            return String.format("| %-8s | %-22s | ₹%,10.2f | %5d | ₹%,12.2f |",
                    productId, name, price, quantity, totalValue());
        }
    }

    // ─── Inventory Service ──────────────────────────────────────────
    static class Inventory {
        private final TreeMap<String, Product> products = new TreeMap<>();
        private int nextId = 1;
        private static final int LOW_STOCK_THRESHOLD = 5;

        public Product addProduct(String name, double price, int quantity) {
            String id = String.format("P%04d", nextId++);
            Product p = new Product(id, name, price, quantity);
            products.put(id, p);
            return p;
        }

        public Product getProduct(String id) {
            Product p = products.get(id);
            if (p == null) throw new NoSuchElementException("Product not found: " + id);
            return p;
        }

        public void removeProduct(String id) {
            if (products.remove(id) == null)
                throw new NoSuchElementException("Product not found: " + id);
        }

        public List<Product> searchByName(String keyword) {
            List<Product> results = new ArrayList<>();
            String lower = keyword.toLowerCase();
            for (Product p : products.values()) {
                if (p.getName().toLowerCase().contains(lower)) {
                    results.add(p);
                }
            }
            return results;
        }

        public void displayInventory() {
            if (products.isEmpty()) {
                System.out.println("  Inventory is empty.");
                return;
            }
            String border = "+" + "-".repeat(10) + "+" + "-".repeat(24) +
                    "+" + "-".repeat(13) + "+" + "-".repeat(7) + "+" + "-".repeat(15) + "+";
            System.out.println(border);
            System.out.printf("| %-8s | %-22s | %11s | %5s | %13s |%n",
                    "ID", "Product Name", "Price", "Qty", "Total Value");
            System.out.println(border);
            products.values().forEach(System.out::println);
            System.out.println(border);

            double totalValue = products.values().stream()
                    .mapToDouble(Product::totalValue).sum();
            System.out.printf("  Total Inventory Value: ₹%,.2f%n", totalValue);
        }

        public void displayLowStockAlerts() {
            List<Product> lowStock = products.values().stream()
                    .filter(p -> p.isLowStock(LOW_STOCK_THRESHOLD))
                    .toList();

            if (lowStock.isEmpty()) {
                System.out.println("  ✔ All products are adequately stocked.");
            } else {
                System.out.println("\n  ⚠ LOW STOCK ALERTS (threshold ≤ " + LOW_STOCK_THRESHOLD + "):");
                for (Product p : lowStock) {
                    System.out.printf("    • %s (%s) — only %d left%n",
                            p.getName(), p.getProductId(), p.getQuantity());
                }
            }
        }
    }

    // ─── Main ───────────────────────────────────────────────────────
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventory inv = new Inventory();

        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║     INVENTORY MANAGEMENT SYSTEM      ║");
        System.out.println("╚══════════════════════════════════════╝");

        boolean running = true;
        while (running) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Remove Product");
            System.out.println("4. Search Product");
            System.out.println("5. View Inventory");
            System.out.println("6. Low Stock Alerts");
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
                        System.out.print("Product Name: ");
                        String name = sc.nextLine().trim();
                        System.out.print("Price: ");
                        double price = Double.parseDouble(sc.nextLine().trim());
                        System.out.print("Quantity: ");
                        int qty = Integer.parseInt(sc.nextLine().trim());
                        Product p = inv.addProduct(name, price, qty);
                        System.out.printf("✔ Added → %s%n", p.getProductId());
                    }
                    case 2 -> {
                        System.out.print("Product ID: ");
                        String id = sc.nextLine().trim();
                        Product p = inv.getProduct(id);
                        System.out.printf("  Current: %s | ₹%.2f | Qty: %d%n",
                                p.getName(), p.getPrice(), p.getQuantity());
                        System.out.print("New Price (or -1 to skip): ");
                        double newPrice = Double.parseDouble(sc.nextLine().trim());
                        if (newPrice >= 0) p.setPrice(newPrice);
                        System.out.print("New Quantity (or -1 to skip): ");
                        int newQty = Integer.parseInt(sc.nextLine().trim());
                        if (newQty >= 0) p.setQuantity(newQty);
                        System.out.println("✔ Product updated.");
                    }
                    case 3 -> {
                        System.out.print("Product ID: ");
                        inv.removeProduct(sc.nextLine().trim());
                        System.out.println("✔ Product removed.");
                    }
                    case 4 -> {
                        System.out.print("Search keyword: ");
                        List<Product> results = inv.searchByName(sc.nextLine().trim());
                        if (results.isEmpty()) {
                            System.out.println("  No products found.");
                        } else {
                            results.forEach(p -> System.out.printf("  %s — %s — ₹%.2f (Qty: %d)%n",
                                    p.getProductId(), p.getName(), p.getPrice(), p.getQuantity()));
                        }
                    }
                    case 5 -> inv.displayInventory();
                    case 6 -> inv.displayLowStockAlerts();
                    case 0 -> {
                        running = false;
                        System.out.println("Goodbye!");
                    }
                    default -> System.out.println("⚠ Invalid choice.");
                }
            } catch (NoSuchElementException | IllegalArgumentException e) {
                System.out.println("✘ " + e.getMessage());
            }
        }
        sc.close();
    }
}
