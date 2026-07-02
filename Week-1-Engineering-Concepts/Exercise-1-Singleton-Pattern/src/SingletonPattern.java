public class SingletonPattern {
    private static SingletonPattern instance;
    private SingletonPattern() {
        System.out.println("Created singleton Object");
    }
    public static SingletonPattern getInstance() {
        if (instance == null) {
            instance = new SingletonPattern();
        }
        return instance;
    }
    public void display(){
        System.out.println("Welcome to Singleton Pattern");
    }
}
