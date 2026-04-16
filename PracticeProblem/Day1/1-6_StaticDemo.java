public class StaticDemo {
    static int count;

    static {
        System.out.println("Static block executed");
        count = 10;
    }

    static void display() {
        System.out.println("Static method called");
        System.out.println("Count value: " + count);
    }

    public static void main(String[] args) {
        System.out.println("Main method executed");
        display();
    }
}