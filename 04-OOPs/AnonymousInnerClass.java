abstract class Greeting {
    abstract void sayHello();
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        // Creating an anonymous inner class that extends Greeting
        Greeting greeting = new Greeting() {
            @Override
            void sayHello() {
                System.out.println("Hello from an anonymous inner class!");
            }
        };

        greeting.sayHello();
    }
}
