

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Price: " + price);
    }    

}

class User {
    int userId;
    String userName;

    User(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }
}



public class ShoppingCart {

    static Product[] cart = new Product[100];
    static int count = 0;

    static void addProduct(java.util.Scanner sc) {
    System.out.print("Enter Product ID: ");
    int id = sc.nextInt();
    sc.nextLine();

    System.out.print("Enter Product Name: ");
    String name = sc.nextLine();

    System.out.print("Enter Price: ");
    double price = sc.nextDouble();

    if (price <= 0) {
        System.out.println("Invalid price!");
        return;
    }

    cart[count++] = new Product(id, name, price);
    System.out.println("Product added to cart!");
    }

    static void removeProduct(java.util.Scanner sc) {
    System.out.print("Enter Product ID to remove: ");
    int id = sc.nextInt();

    for (int i = 0; i < count; i++) {
        if (cart[i].id == id) {
            for (int j = i; j < count - 1; j++) {
                cart[j] = cart[j + 1];
            }
            count--;
            System.out.println("Product removed!");
            return;
        }
    }
    System.out.println("Product not found!");
    }

    static void viewCart() {
    if (count == 0) {
        System.out.println("Cart is empty!");
        return;
    }

    for (int i = 0; i < count; i++) {
        cart[i].display();
    }
    }

    static double calculateTotal() {
    double total = 0;
    for (int i = 0; i < count; i++) {
        total += cart[i].price;
    }
    return total;
    }

    
    public static void main(String[] args){

    }
}
