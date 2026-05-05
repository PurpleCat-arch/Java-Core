public class ParameterizedConstructor {
    String brand;
    int year;

    public ParameterizedConstructor(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public static void main(String[] args) {
        ParameterizedConstructor car = new ParameterizedConstructor("Toyota", 2022);
        System.out.println("Car: " + car.brand + ", Year: " + car.year);
    }
}
