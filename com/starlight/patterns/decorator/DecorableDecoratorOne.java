package com.starlight.patterns.decorator;

public class DecorableDecoratorOne extends Decorator{

    public DecorableDecoratorOne(IDecorable newDecorable) {
        super(newDecorable);
    }

    @Override
    public String prepareDecorable(){
        return super.decorableData()+"with extra addition one ";
    }

    @Override
    public double decorableData(){
        return super.decorableData()+32.0;
    }
}
