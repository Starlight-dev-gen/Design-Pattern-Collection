package com.starlight.patterns.prototype;

public class PrototypeManager {

    private InstanceZero zero;
    private InstanceOne one;

    public PrototypeManager() {
        // PrototypeManager uses composition
        this.zero = new InstanceZero();
        this.one = new InstanceOne();
    }

    public InstanceZero CreateInstanceZero() {
        // Typecasting necessary
        return (InstanceZero)zero.clone();
    }

    public InstanceOne CreateInstanceOne() {
        return (InstanceOne)one.clone();
    }

}
