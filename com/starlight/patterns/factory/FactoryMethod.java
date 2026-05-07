package com.starlight.patterns.factory;

public class FactoryMethod {

    public IType GetType(String subType){
        switch (subType){
            case "Zero":
                return new SubtypeZero();
            case "One":
                return new SubtypeOne();
            case "Two":
                return new SubtypeTwo();
            default:
                return null;
        }
    }

}
