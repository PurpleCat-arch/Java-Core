public class FinalVariable {
    final int MAX_SPEED = 120;

    void displaySpeed() {
        // MAX_SPEED = 150; // This would cause a compile-time error
        System.out.println("The maximum speed is " + MAX_SPEED + " km/h.");
    }

    public static void main(String[] args) {
        FinalVariable car = new FinalVariable();
        car.displaySpeed();
    }
}
