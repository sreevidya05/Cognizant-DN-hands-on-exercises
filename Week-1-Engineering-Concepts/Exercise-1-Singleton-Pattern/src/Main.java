public class Main {
    public static void main(String[] args) {

        SingletonPattern obj1 = SingletonPattern.getInstance();
        SingletonPattern obj2 = SingletonPattern.getInstance();

        obj1.display();

        if (obj1 == obj2) {
            System.out.println("Both objects are the same instance.");
        }
    }
}