public class IllegalArgumentExceptionDemo {
    public static void main(String[] args) {
        try {
            setTemperature(75);
            setTemperature(-300);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();

        try {
            createUser("Alice", 25);
            createUser("", 30);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void setTemperature(double celsius) {
        if (celsius < -273.15) {
            throw new IllegalArgumentException(
                    "Temperature " + celsius + "°C is below absolute zero (-273.15°C).");
        }
        System.out.println("Temperature set to " + celsius + "°C");
    }

    static void createUser(String name, int age) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
        System.out.println("User created: " + name + ", age: " + age);
    }
}
