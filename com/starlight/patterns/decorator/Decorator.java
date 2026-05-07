package com.starlight.patterns.decorator;

public abstract class Decorator implements IDecorable{

    private IDecorable newDecorable;

    public Decorator(IDecorable newDecorable){
        this.newDecorable = newDecorable;
    }

    @Override
    public String prepareDecorable()
    {
        return newDecorable.prepareDecorable();
    }

    @Override
    public double decorableData()
    {
        return newDecorable.decorableData();
    }

}
