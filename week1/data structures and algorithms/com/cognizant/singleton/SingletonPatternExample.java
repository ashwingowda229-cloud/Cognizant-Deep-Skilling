package com.cognizant.singleton;

public class SingletonPatternExample {

    private static SingletonPatternExample instance;

    private SingletonPatternExample() {
        System.out.println("Singleton Instance Created");
    }

    public static SingletonPatternExample getInstance() {
        if (instance == null) {
            instance = new SingletonPatternExample();
        }
        return instance;
    }

    public void displayMessage() {
        System.out.println("Hello from Singleton Pattern!");
    }

    public static void main(String[] args) {
        SingletonPatternExample obj1 = SingletonPatternExample.getInstance();
        obj1.displayMessage();

        SingletonPatternExample obj2 = SingletonPatternExample.getInstance();

        if (obj1 == obj2) {
            System.out.println("Both objects are the same instance.");
        }
    }
}