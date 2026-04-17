

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
    
    public static void main(String[] args){

    }
}
