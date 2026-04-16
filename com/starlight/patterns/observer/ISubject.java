package com.starlight.patterns.observer;

public interface ISubject {

    public void Subscribe(IObserver o);

    public void Unsubscribe(IObserver o);

}
