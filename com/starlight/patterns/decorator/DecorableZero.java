package com.starlight.patterns.decorator;

public class DecorableZero implements IDecorable{

    @Override
    public String prepareDecorable() {
        return "Type Zero Decorable ";
    }

    @Override
    public double decorableData() {
        return 64.0;
    }
    
}
