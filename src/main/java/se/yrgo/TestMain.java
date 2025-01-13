package se.yrgo;

public class TestMain {
    public static void main(String[] args) {
        // Lazy Singleton
        System.out.println("Lazily initialized");
        System.out.println(RootUserLazy.getInstance().toString() + "\n");

        // Public static final instance field Singleton
        System.out.println("Static without a factory method");
        System.out.println(RootUserPSFIF.instance + "\n");

        // Enum Singleton
        System.out.println("Using Enum");
        System.out.println(RootUserEnum.INSTANCE.getHome());
    }
}
