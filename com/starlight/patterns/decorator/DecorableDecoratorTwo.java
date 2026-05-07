package com.starlight.patterns.decorator;

public class DecorableDecoratorTwo extends Decorator {

    public DecorableDecoratorTwo(IDecorable newDecorable) {
        super(newDecorable);
    }

    @Override
    public String prepareDecorable(){
        return super.prepareDecorable()+"with extra addition two ";
    }

    @Override
    public double decorableData(){
        return super.decorableData()+32.0;
    }
}
