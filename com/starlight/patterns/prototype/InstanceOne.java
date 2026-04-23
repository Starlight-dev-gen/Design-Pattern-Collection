package com.starlight.patterns.prototype;

public class InstanceOne extends Prototype{

    public String specialAddition = "Came Later";

    @Override
    public String toString() {
        return "InstanceOne{" +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                "specialAddition='" + specialAddition + '\'' +
                '}';
    }
}
