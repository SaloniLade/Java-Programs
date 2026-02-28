class StaticDemo {

    static int count;
    static {
        count = 0;
        System.out.println("Static Block Executed");
    }
    StaticDemo() {
        count++;
    }
    static void displayCount() {
        System.out.println("Number of Objects Created: " + count);
    }
}public class StaticTest {
    public static void main(String[] args) {

        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();

        StaticDemo.displayCount();
    }
}
