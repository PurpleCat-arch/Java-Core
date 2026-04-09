public class Product {
    private double price;

    public void setPrice(double price) {
        if (price > 0)
            this.price = price;
        else
            System.out.println("Invalid price");
    }

    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Product p = new Product();
        p.setPrice(-100);
        p.setPrice(500);
        System.out.println("Price: " + p.getPrice());
    }
}
