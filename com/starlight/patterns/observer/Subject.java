package com.starlight.patterns.observer;

import java.util.List;
import java.util.ArrayList;

public class Subject implements ISubject {

    private String state;
    // Observed variable
    // Private so changes to it may be tracked

    private List<IObserver> observers = new ArrayList<IObserver>();
    // Observers notified about change in state

    public void SetState(String state) {
        this.state = state;
        Notify();
    }
    // Public setter for state
    // On state change observers are immediately notified

    public void Notify(){
        for (IObserver o : observers) {
            o.Update(state);
        }
    }
    // Observer notification method

    @Override
    public void Subscribe(IObserver o) {
        observers.add(o);
    }

    @Override
    public void Unsubscribe(IObserver o) {
        observers.remove(o);
    }

}
