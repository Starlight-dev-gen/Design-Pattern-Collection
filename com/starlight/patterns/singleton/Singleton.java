package com.starlight.patterns.singleton;

public class Singleton {
// Single responsibility, only one may exist

    private static Singleton instance;

    private Singleton() {}
    // Private constructor so it cannot be instanced

    public static Singleton Instance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
    // Create instance with this method instance

    public void DoSomething() {}

}
