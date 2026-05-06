public class StaticVariables {
    static int globalCount = 0;
    int instanceCount = 0;

    public StaticVariables() {
        globalCount++;
        instanceCount++;
    }

    public static void main(String[] args) {
        StaticVariables obj1 = new StaticVariables();
        StaticVariables obj2 = new StaticVariables();
        StaticVariables obj3 = new StaticVariables();

        System.out.println("Global count (Static): " + StaticVariables.globalCount);
        System.out.println("Instance count for obj3: " + obj3.instanceCount);
    }
}
