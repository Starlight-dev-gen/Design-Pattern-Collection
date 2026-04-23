package com.starlight.patterns.prototype;

public class Prototype implements Cloneable {
    // Prototype can clone itself

    public String name;
    public String type;


    @Override
    protected Object clone() {
        Object obj;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            obj = null;
        }
        return obj;
    }
}
