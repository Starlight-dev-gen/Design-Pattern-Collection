package com.starlight.patterns.prototype;

public class InstanceZero extends Prototype {

    public int additionalData = 64;
    // Default value, can be overwritten

    @Override
    public String toString() {
        return "InstanceZero{" +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                "additionalData=" + additionalData +
                '}';
    }
}
