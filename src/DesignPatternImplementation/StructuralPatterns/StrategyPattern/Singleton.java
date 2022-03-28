package DesignPatternImplementation.StructuralPatterns.StrategyPattern;




public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("Example of Singleton");
        Singleton singletonObjectOne = Singleton.getInstance();
        Singleton singletonObjectTwo = Singleton.getInstance();
        System.out.println(singletonObjectOne);
        System.out.println(singletonObjectTwo);
    }
}