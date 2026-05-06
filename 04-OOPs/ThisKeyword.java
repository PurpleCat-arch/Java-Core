public class ThisKeyword {
    int value;

    public ThisKeyword(int value) {
        // 'this' differentiates instance variable from local variable
        this.value = value;
    }

    public void display() {
        System.out.println("Value is: " + this.value);
    }

    public static void main(String[] args) {
        ThisKeyword obj = new ThisKeyword(42);
        obj.display();
    }
}
