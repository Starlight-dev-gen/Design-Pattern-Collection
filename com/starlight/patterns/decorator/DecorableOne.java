package com.starlight.patterns.decorator;

public class DecorableOne implements IDecorable{

    @Override
    public String prepareDecorable() {
        return "Type One Decorable ";
    }

    @Override
    public double decorableData() {
        return 128.0;
    }

}
