package com.starlight.patterns.decorator;

public class DecorableDecoratorZero extends Decorator {

    public DecorableDecoratorZero(IDecorable newDecorable) {
        super(newDecorable);
    }

    @Override
    public String prepareDecorable(){
        return super.decorableData()+"with extra addition zero ";
    }

    @Override
    public double decorableData() {
        return super.decorableData()+16.0;
    }
}
