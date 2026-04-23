package com.starlight.patterns.adapter;

public class TypeOneDataProcessor implements ITypeOne {

    private String typeOneData;

    public TypeOneDataProcessor(String typeOneData) {
        this.typeOneData = typeOneData;
    }

    @Override
    public void ProcessTypeOne() {
        System.out.println(typeOneData);
    }

    @Override
    public String GetTypeOne() {
        return typeOneData;
    }
}
