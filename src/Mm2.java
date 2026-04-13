abstract class FoodOrder {
    abstract void placeOrder();
    abstract void trackOrder();
}

class ZomatoOrder extends FoodOrder {
    void placeOrder() {
        System.out.println("Order placed on Zomato");
    }

    void trackOrder() {
        System.out.println("Tracking via GPS");
    }
}
public class Mm2 {
    public static void main(String[] args) {
        FoodOrder order = new ZomatoOrder();
        order.placeOrder();
        order.trackOrder();
    }
}
