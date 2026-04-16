package com.starlight.patterns.observer;

public class Observer implements IObserver {

    private String name;

    public Observer(String name) {
        this.name = name;
    }

    @Override
    public void Update(String state) {
        System.out.println(name + " : " + state);
    }

}
